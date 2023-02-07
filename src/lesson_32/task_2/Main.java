package lesson_32.task_2;

import lesson_19.task_1.CopyWithNIO;
import lesson_32.task_2.intefaces.CopyFileTask;
import lesson_32.task_2.intefaces.TaskExecutor;
import lesson_32.task_2.intefaces.TasksStorage;

public class Main {
    public static void main(String[] args) {
        CopyFileTask task1 = new CopyFileTaskImpl("C:\\Users\\User\\Desktop\\11.mp4)",
                "C:\\Users\\User\\Desktop\\Copy\\File1.mp4", 1);
        CopyFileTask task2 = new CopyFileTaskImpl("C:\\Users\\User\\Desktop\\11.mp4)",
                "C:\\Users\\User\\Desktop\\Copy\\File2.mp4", 2);
        CopyFileTask task3 = new CopyFileTaskImpl("C:\\Users\\User\\Desktop\\11.mp4)",
                "C:\\Users\\User\\Desktop\\Copy\\File3.mp4", 3);
        CopyFileTask task4 = new CopyFileTaskImpl("C:\\Users\\User\\Desktop\\11.mp4)",
                "C:\\Users\\User\\Desktop\\Copy\\File4.mp4", 4);
        CopyFileTask task5 = new CopyFileTaskImpl("C:\\Users\\User\\Desktop\\111.mp4)",
                "C:\\Users\\User\\Desktop\\Copy\\File5.mp4", 5);

        task1.setFileCopyUtils(new CopyWithNIO());
        task2.setFileCopyUtils(new CopyWithNIO());
        task3.setFileCopyUtils(new CopyWithNIO());
        task4.setFileCopyUtils(new CopyWithNIO());
        task5.setFileCopyUtils(new CopyWithNIO());


        TasksStorage storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);


        TaskExecutor executor1 = new TaskExecutorImpl();

        executor1.setStorage(storage);

        executor1.start();
    }
}
