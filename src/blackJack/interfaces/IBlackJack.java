package blackJack.interfaces;

import java.util.Set;

public interface IBlackJack {
    /**
     * раздает по две карты
     */
    void dealTwoCards();

    /**
     * Раздает добавочные карты при необходимости
     */
    void addCardsToPlayers();

    /**
     * Напечатать победителя в консоль
     */
    void printWinner();

    /**
     *Добавляет игроков в игру
     */
    void addPlayerToGame(IPlayer player);




}
