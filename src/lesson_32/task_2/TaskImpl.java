package lesson_32.task_2;

import lesson_32.task_2.exception.TaskExecutionFailedException;
import lesson_32.task_2.intefaces.Task;

public abstract class TaskImpl implements Task {

    private int tryCount = 0;

    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }

}
