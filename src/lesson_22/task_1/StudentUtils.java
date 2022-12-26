package lesson_22.task_1;

import java.util.List;
import java.util.function.Predicate;

public class StudentUtils {

    public static void filter(List<Student> students, Predicate <Student>predicate){
        for (Student student : students) {
            if (predicate.test(student)) {

                System.out.println();
            }
        }
    }
}
