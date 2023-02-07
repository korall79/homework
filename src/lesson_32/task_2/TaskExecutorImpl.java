package lesson_32.task_2;

import lesson_32.task_2.intefaces.Task;
import lesson_32.task_2.intefaces.TaskExecutor;
import lesson_32.task_2.intefaces.TasksStorage;

public class TaskExecutorImpl implements TaskExecutor, Runnable {

    private TasksStorage storage;
    private boolean isStopped;

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
            // 1. достать задачу из хранилища
            //2, если за дач нет заверщить работу. если задача получена-выполнить
            //3, если задача выполнена - вывести в консоль результат
            //4, если задача не выполнена - увеличить счетчик кол-ва выполнений и вернуть задачу в хранилище
            //если счетчикраве 5 то задачу в хранилище не возвращать, удалить окончательно

            Task task = storage.get();
            String threadName = Thread.currentThread().getName();

            if (task == null) {
                System.out.printf("Задач на выполнение нет, поток %s завершает свою работу", threadName);
                stop();
                continue;
            }

            int taskId = task.getId();

            try {
                System.out.printf("Поток %s ыполняет задачу %d", threadName);
                task.execute();
                System.out.printf("Задача %d успешно выполнена потоком %s", taskId, threadName);
            } catch (Exception e) {
                int tryCount = task.getTryCount();

                if (tryCount >=5){
                    System.out.printf("Количество попыток выполнения задачи %d превышено. Поток %s удаляет задачу", taskId, threadName);
                }else {
                    task.incTryCount();
                    storage.add(task);
                    System.out.printf("Поток %s ыернул задачу %d в хранилище", threadName, taskId);

                }
            }

        }
    }
}
