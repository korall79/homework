package lesson_32.task_2;

import lesson_32.task_2.intefaces.Task;
import lesson_32.task_2.intefaces.TasksStorage;

import java.util.ArrayList;
import java.util.List;

public class TaskStorageImpl implements TasksStorage {

    private List<Task> tasks = new ArrayList<>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        if (task == null) {
            throw new NullPointerException("Задача не может быть null");
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
