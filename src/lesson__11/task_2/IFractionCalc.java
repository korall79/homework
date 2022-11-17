package lesson__11.task_2;

public interface IFractionCalc {
    /**
     * Метод считает сумму дробей
     * @param fraction1 первая дробь
     * @param fraction2 вторая дробь
     * @return результат сложения двух дробей
     */
    Fraction sum(Fraction fraction1, Fraction fraction2);

    /**
     * Метод считает разницу дробей
     * @param fraction1 первая дробь
     * @param fraction2 вторая дробь
     * @return  результат вычитания двух дробей
     */
    Fraction sub(Fraction fraction1, Fraction fraction2);

    /**
     * Метод считает произведение дробей
     * @param fraction1 первая дробь
     * @param fraction2 вторая дробь
     * @return  результат умножения двух дробей
     */
    Fraction mul(Fraction fraction1, Fraction fraction2);

    /**
     * Метод считает деление дробей
     * @param fraction1 первая дробь
     * @param fraction2 вторая дробь
     * @return  результат деления двух дробей
     */
    Fraction div(Fraction fraction1, Fraction fraction2);
}
