package lesson_22.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Student >students = new ArrayList<>();

        students.add(new Student("Zopa",33.4,4));
        students.add(new Student("Tim",7.52,1));
        students.add(new Student("Mi",6.1,5));
        students.add(new Student("We",7.2,4));

//        StudentUtils.filter(students,new FilterImpl());
//
//        System.out.println();
//
//        int a = 7;
//
//        StudentUtils.filter(students, new Filter() {
//            @Override
//            public boolean test(Student student) {
////                return "Zopa".equals(student.getName())||"Tim".equals(student.getName());
//                return  student.getAvarageRate()>9.5;
//            }
//        });
        System.out.println();

        StudentUtils.filter(students,x-> x.getAvarageRate()>9.5);

        Predicate<Student> predicate = x-> x.getCours()>2;

        System.out.println();

        StudentUtils.filter(students, predicate);

        Predicate<Student>predicate1 = x -> x.getAvarageRate()>9;

        System.out.println("Применяем сразу два фильтра");

        StudentUtils.filter(students, predicate.and(predicate1));

        System.out.println();

        StudentUtils.filter(students, predicate.or(predicate1));//или

        System.out.println();

        StudentUtils.filter(students, predicate.and(predicate1).negate());

//        System.out.println("Выборчно удаляем студ и коллекции");
//
//        students.removeIf(predicate);
//        System.out.println(students);

        Consumer<Student>consumer = x -> System.out.println(x);

        Consumer<Student> consumer1 = x -> x.setCours(x.getCours()+1);

        System.out.println("Применяем косьюмер");
       //students.forEach(consumer1);
        students.forEach(consumer1.andThen(consumer));


    }
}
