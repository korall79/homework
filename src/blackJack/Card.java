package blackJack;

public class Card {

    private String name;
    private  int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void open(){
        System.out.println(name);
    }
}
