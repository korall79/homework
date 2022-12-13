package lesson_18.Homework;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private String name;
    private List<T> fruits = new ArrayList<>();
    private double weight;
    private double amount;


    public Box(double weight, double amount) {
        this.weight = weight;
        this.amount = amount;
    }

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {

        double weightBox = amount *weight;

        return weightBox;

    }


    @Override
    public String toString() {
        return String.format("Box "+ name+ ": weight="+weight+ ", amount="+amount);
    }
}
