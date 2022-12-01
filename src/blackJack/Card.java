package blackJack;

import blackJack.interfaces.ICard;

import java.util.Objects;

public class Card implements ICard {

    private String name;
    private  int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }
@Override
    public void open(){
        System.out.println(name+" "+value);
    }

    @Override
    public int getValue() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(name, card.name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

}
