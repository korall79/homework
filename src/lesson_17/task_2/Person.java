package lesson_17.task_2;

public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public void setAge(int age) throws TooYoungException{
        if (age < 16) {
            System.out.println("Выброшена ошибка!");
            throw new TooYoungException("Возраст слишком мал");
        }
        if (age > 150) {
            throw new TooOldException("Возраст слишком велик");
        }
        this.age = age;
    }
}
