package lesson_19.homework;


import lesson_19.task_1.ICopyUtils;

public class Main {
    public static void main(String[] args) {


    ICopyUtils copy = new Copy();
     long Start = System.currentTimeMillis();
        copy.copy("C:\\Users\\User\\Desktop\\11.mp4", "copy\\copy.mp4");
    long end = System.currentTimeMillis();
        System.out.println(end-Start);
}}
