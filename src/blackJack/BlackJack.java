package blackJack;

import blackJack.interfaces.IBlackJack;
import blackJack.interfaces.IDeck;
import blackJack.interfaces.IPlayer;

import java.util.HashSet;
import java.util.Set;

public class BlackJack implements IBlackJack {

    private Set<IPlayer> players = new HashSet<>();
    private IDeck deck = new Deck();

    @Override
    public void dealTwoCards() {
        for (IPlayer player: players) {
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
            
        }
    }

    @Override
    public void addCardsToPlayers() {
        for (IPlayer player : players) {
            while (player.isNeedAnotherCard()){
                player.addCardToHand(deck.getRandomCard());
            }
        }

    }

    @Override
    public void printWinner() {
        //у всех перебор - победил крупье
        //у некоторых перебор - победил игрок с макс очками
        //одинаковое макс очки - победили игроки с макс очками

        Set<IPlayer> notBustPlayers = new HashSet<>();
        for (IPlayer player : notBustPlayers) {
            if (player.countValues() <= 21){
                notBustPlayers.add(player);
            }
        }
        if (notBustPlayers.isEmpty()){
            System.out.println("Победил крупье!");
            return;
        }
        if (notBustPlayers.size()==1){
            IPlayer winner = notBustPlayers.iterator().next();
            System.out.println("Победил игрок "+ winner.getName());
            winner.openCards();
            return;
        }
        int max = getWinnerValue(notBustPlayers);

        System.out.println("Победители:");

        for (IPlayer player : notBustPlayers) {
            if (player.countValues() == max) {
                System.out.println(player.getName());
                player.openCards();
            }

        }

    }

    /**
     * Определяет победителя
     * @param players
     * @return
     */
    private int getWinnerValue(Set<IPlayer >players){
        int max = 0;
        for (IPlayer player : players) {
            if (player.countValues() >max){
                max= player.countValues();
            }
        }
        return max;
    }

    @Override
    public void addPlayerToGame(IPlayer player) {
        players.add(player);
    }


}
