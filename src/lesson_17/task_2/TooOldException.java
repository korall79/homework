package lesson_17.task_2;

public class TooOldException extends RuntimeException {
    public TooOldException(String message) {
        super(message);
    }

    public TooOldException() {
    }
}
