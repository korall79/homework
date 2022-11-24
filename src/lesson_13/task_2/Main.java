package lesson_13.task_2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>arrayList= new ArrayList<>();
        LinkedList<String>linkedList= new LinkedList<>();

        System.out.println("Добавляем эл в аррай лист");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add("a");

        }
        long end = System.currentTimeMillis();

        System.out.println("Ресультат - " + (end-start)+"миллисекунд");
    }


}
