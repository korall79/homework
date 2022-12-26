package lesson_22.task_1;

import java.util.Objects;

public class Student {
    private String name;
    private double avarageRate;
    private int cours;

    public Student(String name, double avarageRate, int cours) {
        this.name = name;
        this.avarageRate = avarageRate;
        this.cours = cours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvarageRate() {
        return avarageRate;
    }

    public void setAvarageRate(double avarageRate) {
        this.avarageRate = avarageRate;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.avarageRate, avarageRate) == 0 && cours == student.cours && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, avarageRate, cours);
    }

    @Override
    public String toString() {
        return String.format("Студент: имя - %s, ср балл- %.2f, курс- %d",name,avarageRate,cours);
    }
}
