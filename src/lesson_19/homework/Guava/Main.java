package lesson_19.homework.Guava;

import lesson_19.task_1.ICopyUtils;

public class Main {
    public static void main(String[] args) {
        ICopyUtils copyGuava= new CopyGuava();
        long Start = System.currentTimeMillis();
        copyGuava.copy("C:\\Users\\User\\Desktop\\11.mp4", "copy\\copy1.mp4");
        long end = System.currentTimeMillis();
        System.out.println(end-Start);
    }
}
