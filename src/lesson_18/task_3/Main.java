package lesson_18.task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Print print = new Print();
        List<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(4);
        integers.add(5);

        integers=null;

        System.out.println(print.getFirstElement(integers));
    }
}
