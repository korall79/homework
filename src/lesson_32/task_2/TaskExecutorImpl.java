package lesson_32.task_2;

import lesson_21.task_2.Main;
import lesson_32.task_2.intefaces.Task;
import lesson_32.task_2.intefaces.TaskExecutor;
import lesson_32.task_2.intefaces.TasksStorage;
import org.apache.log4j.Logger;

public class TaskExecutorImpl implements TaskExecutor, Runnable {

    private TasksStorage storage;
    private boolean isStopped;
    private static Logger log = Logger.getLogger(TaskExecutorImpl.class);

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {
        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        new Thread(this).start();
    }

    @Override
    public void stop() throws IllegalStateException {
        isStopped = true;
    }

    @Override
    public void run() {
        while (!isStopped) {
            //1. достать задачу из хранилища
            //2. если задач нет- заверщить работу, если задача получена-выполнить ее
            //3. если задача выполнена - вывести в консоль результат
            //4. если задача не выполнена - увеличить счетчик кол-ва выполнений
            // и вернуть задачу в хранилище
            // если счетчик равен 5, то задачу в хранилище не возвращать,
            // удалить окончательно.

            Task task = storage.get();
            String threadName = Thread.currentThread().getName();

            if (task == null) {
                log.debug(String.format("Задач на выполнение нет, поток %s завершает свою работу\n", threadName));
                stop();
                continue;
            }

            int taskId = task.getId();

            try {
                log.debug(String.format("Поток %s выполняет задачу %d\n", threadName,taskId));
                task.execute();
                log.debug(String.format("Задача %d успешно выполнена потоком %s\n", taskId, threadName));

            } catch (Exception e) {
                int tryCount = task.getTryCount();

                if (tryCount >= 5){
                    log.debug(String.format("Количество попыток выполнения задачи %d превышено.\n" +
                            "Поток %s удаляет задачу\n", taskId, threadName));
                }else {
                    task.incTryCount();
                    storage.add(task);
                    log.debug(String.format("Поток %s вернул задачу %d в хранилище\n", threadName, taskId));
                }
            }

        }
    }
}
