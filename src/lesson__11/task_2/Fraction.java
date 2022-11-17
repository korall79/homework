package lesson__11.task_2;

import java.util.Objects;

public class Fraction implements IFraction {
    /**
     * Числитель
     */
    private int numerator;
    /**
     * Знаменатель
     */
    private int denominator;

    /**
     * Конструктор дроби
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Знаменатель не может быть равен нулю, вместо нуля ставится 1");
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
            System.out.println("Знаменатель не может быть равен нулю, вместо нуля ставится 1");
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



class Math{
    /**
     * вычисляет наибольший общий делитель НОД
     * @param a
     * @param b
     * @return
     */
    static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }
    /**
     * вычисляет наименьшее общее кратное НОК
     * @param a
     * @param b
     * @return
     */
    static int nok(int a, int b){
        return a*b / nod(a, b);
    }
}

}
