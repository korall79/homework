package lesson_18.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//<?> любой тип - вайлд кардс

        Info<?> info = new Info<>("lklj");
       // info.setValue();
        // <? extends>
        //<? super X>

        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);

        info.printElements(integers);

        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        info.printElements(strings);

        System.out.println(info.sum(integers));
    }
}
