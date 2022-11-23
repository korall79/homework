package lesson_13.task_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionUtils utils = new CollectionUtilsImpl();

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);

        Collection<Integer> result = utils.union(listA,listB);

    }
}
