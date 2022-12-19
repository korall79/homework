package lesson_20.task_3;

import lesson_20.task_1.Car;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set <Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getColor().compareTo(car2.getColor());
            }
        });
        cars.add(new Car("Honda","Brown", 150, "diesel"));
        cars.add(new Car("Tesla","Red", 600, "electric"));
        cars.add(new Car("Toyota","Blac", 300, "diesel"));
        System.out.println(cars);
    }
}
