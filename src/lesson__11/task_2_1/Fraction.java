package lesson__11.task_2_1;

import java.util.Objects;

/**
 * Класс, описывающий простую дробь
 */
public class Fraction implements IFraction, IFractionCalc {

    /**
     * Числитель дроби
     */
    private int numerator;

    /**
     * Знаменатель дроби
     */
    private int denominator;

    /**
     * Конструктор
     *
     * @param numerator   - значение числителя
     * @param denominator - значение знаменателя (если передаётся ноль,
     *                    значение принимается равным единице)
     */
    public Fraction(int numerator, int denominator) {
        if (0 == denominator) {
            System.out.println("Ошибка! Знаменатель не может быть равен нулю.\nЗначение" +
                    "знаменателя принято равным единице.");
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Метод вычисляет сумму двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    @Override
    public Fraction sum(Fraction otherFraction) {

        // Вычисляем числитель результирующей дроби
        // (если не помним формулы из математики, ищем в интернете)
        int numerator = getNumerator() * otherFraction.getDenominator()
                + otherFraction.getNumerator() * getDenominator();

        // Вычисляем знаменатель результирующей дроби
        int denominator = getDenominator() * otherFraction.getDenominator();

        // Создаём объект результирующей дроби, передавая в конструктор числитель и знаменатель
        Fraction result = new Fraction(numerator, denominator);

        // Сокращаем дробь, вызывая метод ниже
        result.reduceFraction();

        // Возвращаем результат
        return result;
    }

    /**
     * Метод вычисляет разность двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    @Override
    public Fraction sub(Fraction otherFraction) {

        // Вычисляем числитель результирующей дроби
        // (если не помним формулы из математики, ищем в интернете)
        int numerator = getNumerator() * otherFraction.getDenominator()
                - otherFraction.getNumerator() * getDenominator();

        // Вычисляем знаменатель результирующей дроби
        int denominator = getDenominator() * otherFraction.getDenominator();

        // Создаём объект результирующей дроби, передавая в конструктор числитель и знаменатель
        Fraction result = new Fraction(numerator, denominator);

        // Сокращаем дробь, вызывая метод ниже
        result.reduceFraction();

        // Возвращаем результат
        return result;
    }

    /**
     * Метод вычисляет произведение двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    @Override
    public Fraction mul(Fraction otherFraction) {

        // Вычисляем числитель результирующей дроби
        // (если не помним формулы из математики, ищем в интернете)
        int numerator = getNumerator() * otherFraction.getNumerator();

        // Вычисляем знаменатель результирующей дроби
        int denominator = getDenominator() * otherFraction.getDenominator();

        // Создаём объект результирующей дроби, передавая в конструктор числитель и знаменатель
        Fraction result = new Fraction(numerator, denominator);

        // Сокращаем дробь, вызывая метод ниже
        result.reduceFraction();

        // Возвращаем результат
        return result;
    }

    /**
     * Метод вычисляет частное двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    @Override
    public Fraction div(Fraction otherFraction) {

        // Вычисляем числитель результирующей дроби
        // (если не помним формулы из математики, ищем в интернете)
        int numerator = getNumerator() * otherFraction.getDenominator();

        // Вычисляем знаменатель результирующей дроби
        int denominator = getDenominator() * otherFraction.getNumerator();

        // Создаём объект результирующей дроби, передавая в конструктор числитель и знаменатель
        Fraction result = new Fraction(numerator, denominator);

        // Сокращаем дробь, вызывая метод ниже
        result.reduceFraction();

        // Возвращаем результат
        return result;
    }

    /**
     * Метод сокращает дробь до несократимого значения
     */
    private void reduceFraction() {

        // Получаем числитель и знаменатель текущей дроби
        int numerator = getNumerator();
        int denominator = getDenominator();

        // Получаем наибольший общий делитель, вызвав метод, написанный ниже
        int nod = getGreatestCommonDivisor(numerator, denominator);

        // Делим числитель и знаменатель дроби на наибольший общий делитель
        setNumerator(numerator / nod);
        setDenominator(denominator / nod);
    }

    /**
     * Метод находит наибольший общий делитель для двух целых чисел
     *
     * @param a - первое число
     * @param b - второе число
     * @return  - наибольший общий делитель
     */
    private int getGreatestCommonDivisor(int a, int b) {

        // Приводим значение полученных чисел к абсолютному значению
        // для корректного вычисления наибольшего общего делителя
        a = Math.abs(a);
        b = Math.abs(b);

        // Такой алгоритм вычисления наибольшего общего делителя
        // можно было найти в интернете, чтобы самим не придумывать
        while (0 != a && 0 != b) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        // Т.к. в результате работы предыдущего цикла одна из переменных a и b окажется нулём,
        // но мы не знаем, какая именно, то мы просто их складываем и получаем наибольший общий делитель
        return a + b;
    }

    /**
     * Метод возвращает значение простой дроби в десятичном виде
     *
     * @return - значение дроби
     */
    @Override
    public double valueOfFraction() {
        return numerator / (double) denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (0 == denominator) {
            System.out.println("Ошибка! Знаменатель не может быть равен нулю.\nЗначение" +
                    "знаменателя принято равным единице.");
            denominator = 1;
        }
        this.denominator = denominator;
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
        return numerator + " / " + denominator;
    }
}
