package lesson_18.task_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Jon", 34);
        Developer developer2 = new Developer("Vac", 33);

        Tester teeter1 = new Tester("Sam", 20);
        Tester teeter2 = new Tester("Max", 50);

        Team<Developer> developers = new Team<>("Разработчики");
        Team<Tester> testers = new Team<>("Тестировщики");

        developers.addParticipant(developer1);
        developers.addParticipant(developer2);

        testers.addParticipant(teeter1);
        testers.addParticipant(teeter2);

        Team<Developer> developers2 = new Team<>("Разработчики-2");

        developers.printWinner(developers2);

    }
}
