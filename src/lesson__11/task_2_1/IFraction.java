package lesson__11.task_2_1;

/**
 * Интерфейс простой дроби
 */
public interface IFraction {

    /**
     * Метод возвращает значение простой дроби в десятичном виде
     *
     * @return - значение дроби
     */
    double valueOfFraction();

    void setNumerator(int numerator);

    void setDenominator(int denominator);

    int getNumerator();

    int getDenominator();
}
