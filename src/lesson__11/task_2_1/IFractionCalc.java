package lesson__11.task_2_1;

/**
 * Интерфейс математических операций с простыми дробями
 */
public interface IFractionCalc {

    /**
     * Метод вычисляет сумму двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    Fraction sum(Fraction otherFraction);

    /**
     * Метод вычисляет разность двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    Fraction sub(Fraction otherFraction);

    /**
     * Метод вычисляет произведение двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    Fraction mul(Fraction otherFraction);

    /**
     * Метод вычисляет частное двух простых дробей
     *
     * @param otherFraction - вторая дробь
     * @return              - результирующая дробь
     */
    Fraction div(Fraction otherFraction);
}
