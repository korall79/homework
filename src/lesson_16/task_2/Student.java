package lesson_16.task_2;

import java.util.Objects;

public class Student {

    private  int id;
    private String name;
    private String surname;
    private int course;

    public Student(int id, String name, String surname, int course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSurname() {
        return surname;
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }

    public int getCourse() {
        return course;
    }

//    public void setCourse(int course) {
//        this.course = course;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, course);
    }

    @Override
    public String toString() {
        return String.format("Студент: идентификатор-%d, имя-%s, фамилия - %s, курс - %d",
                id,name,surname,course);
    }
}
