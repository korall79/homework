package blackJack.interfaces;

public interface IPlayer {
    /**
     * смотрит карты
     *
     * @param card
     */
    void addCardToHand(ICard card);

    /**
     * нужна ли другая карта
     *
     * @return
     */
    boolean isNeedAnotherCard();

    /**
     * Открывает карты
     */
    void openCards();

    /**
     * Считает сумму очков
     *
     * @return
     */
    int countValues();

    String getName();

}
