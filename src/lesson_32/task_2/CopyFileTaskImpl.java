package lesson_32.task_2;

import lesson_19.task_1.ICopyUtils;
import lesson_32.task_2.exception.TaskExecutionFailedException;
import lesson_32.task_2.intefaces.CopyFileTask;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask {

    private String to;
    private String from;
    private ICopyUtils copyUtils;
    private int id;

    public CopyFileTaskImpl(String from, String to, int id) {
        this.to = to;
        this.from = from;
        this.id = id;
    }

    @Override
    public void setFileCopyUtils(ICopyUtils copyUtils) {
        this.copyUtils = copyUtils;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {
            copyUtils.copy(from,to);
        }catch (Exception e){
            throw new TaskExecutionFailedException(e.getMessage());
        }
    }
    @Override
    public int getId() {
        return id;
    }
}
