package lesson_13.task_5;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//123454567
        List<Integer> result = new ArrayList<>();
        if (a == null || b == null) {
            System.out.println("Колекция не может быть нал");
            return result;
        }
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException { //4545

        ArrayList<java.util.Collection<Integer>> duplicate = new ArrayList<>();
        Set<Integer> tracking = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        for (Integer integer : result) {
            if (!tracking.add(integer)) {
                duplicate.add(Collections.singleton(integer));
            }
        }
        return (ArrayList)duplicate;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//1234567

        ArrayList<Integer> duplicate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);

        for (Integer integer : set) {
            if (!set.add(integer)) {
                duplicate.add(integer);
            }
        }
        return set;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//45
        HashSet<Integer> noDuplicate = new HashSet<>(a);
        noDuplicate.retainAll(b); //retainAll -метод, который сохраняет только те элементы коллекции, которые содержатся в указанной коллекции.
        return noDuplicate;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {//12367
        ArrayList<Integer> duplicate = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);

        for (Integer integer : set) {
            if (set.add(integer)) {
                duplicate.remove(integer);
            }
        }
        return set;
    }
}
