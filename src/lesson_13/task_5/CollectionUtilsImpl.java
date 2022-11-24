package lesson_13.task_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils{
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//123454567
        List<Integer> result = new ArrayList<>();
        if(a== null || b == null){
            System.out.println("Колекция не может быть нал");
            return result;
        }
//        for (Integer integer : a) {
//            result.add(integer);
//        }
//        for (Integer integer : b) {
//            result.add(integer);
//        }

        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException { //4545
        ArrayList<Integer> resultIntersection = new ArrayList<>();
      //  if (a==b)
//contains
            resultIntersection.addAll(a);
            resultIntersection.addAll(b);
        return resultIntersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//1234567
        return null;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//45
        return null;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//12367
        return null;
    }
}
