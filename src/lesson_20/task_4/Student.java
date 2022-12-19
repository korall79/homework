package lesson_20.task_4;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int age;
    private double avarageRate;
    private int course;

    public Student(String name, String surname, int age, double avarageRate, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avarageRate = avarageRate;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.avarageRate, avarageRate) == 0 && course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, avarageRate, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", avarageRate=" + avarageRate +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvarageRate() {
        return avarageRate;
    }

    public void setAvarageRate(double avarageRate) {
        this.avarageRate = avarageRate;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
