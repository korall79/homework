package lesson_9.task_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

//        cat.voice();
//        dog.voice();

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        LandAnimal[] animals = new LandAnimal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = cat1;
        animals[3] = dog1;

        for (LandAnimal animal : animals) {
            animal.voice();

        }
    }
}
