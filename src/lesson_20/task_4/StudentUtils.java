package lesson_20.task_4;

import java.util.List;

public class StudentUtils {

    public static void filter(List<Student>students, IFilter filter){

        for (Student student : students) {
            if (filter.test(student)){
                System.out.println(student);
            }

        }

    }
}
