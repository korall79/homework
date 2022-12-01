package blackJack;

import blackJack.interfaces.IBlackJack;
import blackJack.interfaces.IPlayer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Начало игры.\n");
        IBlackJack game = new BlackJack();

        game.addPlayerToGame(new Player("Алиса"));
        game.addPlayerToGame(new Player("Денис"));
        game.addPlayerToGame(new Player("Азат"));
        game.addPlayerToGame(new Player("Андрей"));
        game.addPlayerToGame(new Dealer());

        game.dealTwoCards();
        game.addCardsToPlayers();


        game.printWinner();
    }
}
