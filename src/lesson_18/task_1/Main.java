package lesson_18.task_1;

import homework_7.Cat;
import lesson_9.task_2.Dog;
import lesson_9.task_2.LandAnimal;

public class Main {
    public static void main(String[] args) {
        Info<Integer> integerInfo = new Info<>(5);
        integerInfo.printValue();

        Info<Cat>catInfo= new Info<>(new Cat("Black"));
        catInfo.printValue();

        Integer integer = integerInfo.getValue();
        Cat cat = catInfo.getValue();

        String a = "Hello";
        String b = "Hello world";

        a=b;

        Dog dog= new Dog();

        LandAnimal dog1= dog;

        Info<Dog> dogInfo= new Info<>();

        Info<LandAnimal> landAnimalInfo= new Info<>();
    }
}
