package lesson_9.task_1;

public class Student extends Person {

    private int scholarship;
    private String universityName;

    public Student(String name, int age, int scholarship, String universityName) {
        super(name, age);
        this.scholarship=scholarship;
        this.universityName=universityName;
    }
}
