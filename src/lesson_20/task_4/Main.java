package lesson_20.task_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student>students = new ArrayList<>();

        students.add(new Student("Ivan","Ivanov",24,9.73,3));
        students.add(new Student("Piter","Petrov",15,5.32,2));
        students.add(new Student("Alis","Alisova",35,10.2,5));
        students.add(new Student("Oleg","Olegin",39,8.5,5));
        students.add(new Student("Cofa","Conina",25,10.2,1));


        System.out.println("Студенты с возрастом больше 25 лет");
        StudentUtils.filter(students,new Filter());

        System.out.println("Студенты с баллом больше 9,0");
        StudentUtils.filter(students, new IFilter() {
            @Override
            public boolean test(Student student) {

                return student.getAvarageRate()>9.0;
            }
        });
        System.out.println("Студенты с именами Ivan");
        StudentUtils.filter(students, new IFilter() {
            @Override
            public boolean test(Student student) {
                return student.getName().equals("Ivan");
            }
        });
        System.out.println("Студенты учатся на 2 курсе");
        StudentUtils.filterCourse(students, new Filter());
    }
}
