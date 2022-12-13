package lesson_18.Homework;

public abstract class Fruit {

    public double weight;
    public double amount;

    public Fruit( double weight, double amount) {

        this.weight = weight;
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fruit{" +

                ", weight=" + weight +
                ", amount=" + amount +
                '}';
    }


}
