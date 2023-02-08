package lesson_32.task_2;

import lesson_32.task_2.intefaces.Task;
import lesson_32.task_2.intefaces.TasksStorage;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TaskStorageImpl implements TasksStorage {

    private List<Task> tasks = new ArrayList<>();
    private static Logger log = Logger.getLogger(TaskStorageImpl.class);

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            log.error("Задача не может быть null");
            throw new NullPointerException();
        }
        tasks.add(task);
    }

    @Override
    public synchronized Task get() {
       if (tasks.isEmpty()){
           return  null;
       }else {
          return tasks.remove(0);

//          Task task = tasks.get(0);
//          tasks.remove(0);
//          return task;
       }
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
