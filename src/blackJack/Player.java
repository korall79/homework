package blackJack;

import blackJack.interfaces.ICard;
import blackJack.interfaces.IPlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Player implements IPlayer {

    private String name;
    private List<ICard> cards = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void addCardToHand(ICard card) {
        cards.add(card);
    }

    @Override
    public boolean isNeedAnotherCard() {
        System.out.println(name + ", нужна ли еще карта? Да / Нет");
        openCards();

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        return "да".equalsIgnoreCase(answer);
    }

    @Override
    public void openCards() {
        for (ICard card : cards) {
            card.open();

        }

    }

    @Override
    public int countValues() {
        int sum = 0;
        for (ICard card : cards) {
            sum+=card.getValue();
        }
        return sum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Игрок" + name;
    }
}
