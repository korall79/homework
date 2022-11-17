package lesson__11.task_2;

public interface IFraction {
    /**
     * Метод задает значение числителю
     * @param value число
     */
    void setNumerator(int value);


    /**
     * Метод задает значение знаменателю
     * @param value число
     */
    void setDenominator(int value);



    /**
     * Метод возвращает числитель
     * @return  числитель
     */
    int getNumerator();


    /**
     * Метод возвращает знаменатель
     * @return  знаменатель
     */
    int getDenominator();


    /**
     *Метод получает значение дроби
     * @return
     */
    double getValueOfFraction();


    }




