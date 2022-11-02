package lesson_10.task_1;

import lesson_8.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 =new Circle(5);

        System.out.println(circle.equals(circle1));

        System.out.println(circle.hashCode());
        System.out.println(circle1.hashCode());

        System.out.println(circle);
        System.out.println(circle1);

    }
    }


