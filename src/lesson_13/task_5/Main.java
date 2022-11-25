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

        Collection<Integer> result = utils.union(listA,listB);//123454567
        System.out.println(result);

        Collection<Integer> resultIntersection = utils.intersection(listA,listB);//4545
        System.out.println(resultIntersection);

        Collection<Integer> resultUWD = utils.unionWithoutDuplicate(listA,listB);//1234567
        System.out.println(resultUWD);

        Collection<Integer> resultIWD = utils.intersectionWithoutDuplicate(listA,listB);//45
        System.out.println(resultIWD);

        Collection<Integer> difference = utils.difference(listA,listB);//12367
        System.out.println(difference);



    }
}
