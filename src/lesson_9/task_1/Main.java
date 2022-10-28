package lesson_9.task_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Max", 28);
        Student student = new Student("Sergey",21, 5000,"ИжГТУ");
        Schoolkid schoolkid = new Schoolkid("Мфрина",8,23,4.7);

        person.printInfo();
        student.printInfo();
        schoolkid.printInfo();
    }
}
