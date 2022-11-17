package lesson_11.task_2;

import java.util.Objects;

public class Fraction implements IFraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Знаменатель не может быть равна нулю,");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void setNumerator(int value) {
        this.numerator = value;
    }

    @Override
    public void setDenominator(int value) {
        if (numerator == 0) {
            System.out.println("Знаменатель не может быть равна нулю,");
            numerator = 1;
        }
        this.denominator = value;
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public double getValueOfFraction() {
        return numerator / (double)denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return String.format("Простая дробь с числителем %d и знаменателем %d",numerator,denominator);
    }
}
