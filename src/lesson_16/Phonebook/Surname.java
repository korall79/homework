package lesson_16.Phonebook;

import java.util.Objects;

public class Surname {
    private String surname;

    public Surname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Surname surname1 = (Surname) o;
        return Objects.equals(surname, surname1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname);
    }
}


