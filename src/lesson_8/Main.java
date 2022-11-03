package lesson_8;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;


        while (!"0".equals(input)) {
            System.out.println("Введите фигуру (номер)\n" +
                    "1 - Площадь квадрата\n" +
                    "2 - Площадь круга\n" +
                    "3 - Периметр квадрата\n" +
                    "4 - Периметр круга\n" +
                    "5 - Площадь прямоугольника\n" +
                    "6 - Периметр прямоугольника\n" +
                    "0 - Выход из программы");

            input = scanner.nextLine();

            switch (input) {
                case "1":
                    printSquareArea(scanner);
                    break;
                case "2":
                    printCircleArea(scanner);
                    break;
                case "3":
                    printSquarePerimeter(scanner);
                    break;
                case "4":
                    printCirclePerimeter(scanner);
                    break;
                case "5":
                    printRectangleArea(scanner);
                    break;
                case "6":
                    printRectanglePerimeter(scanner);
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Ошибка!Неверный код");
                    break;
            }
        }
        System.out.println("Выход из программы");
    }


    /**
     * Метод ввода в консоль данных для периметра прямоугольника
     */
    private static void printRectanglePerimeter(Scanner scanner) {
        System.out.println("Введите длину стороны прямоугольника");
        String sideWidth = scanner.nextLine();
        characterCheck(sideWidth);
        System.out.println("Введите высоту стороны прямоугольника");
        String sideLength = scanner.nextLine();
        characterCheck(sideLength);
        Rectangle rectangle = new Rectangle(sideLength, sideWidth);
        rectangle.printPerimeter();
    }

    /**
     * Метод ввода в консоль данных для площади прямоугольника
     */
    private static void printRectangleArea(Scanner scanner) {
        System.out.println("Введите длину стороны прямоугольника");
        String sideWidth = scanner.nextLine();
        characterCheck(sideWidth);
        System.out.println("Введите высоту стороны прямоугольника");
        String sideLength = scanner.nextLine();
        characterCheck(sideLength);
        Rectangle rectangle = new Rectangle(sideLength, sideWidth);
        rectangle.printArea();
    }

    /**
     * Метод ввода в консоль данных площади для квадрата
     */
    private static void printSquareArea(Scanner scanner) {
        System.out.println("Введите длину стороны квадрата");
        String sideLength = scanner.nextLine();

        characterCheck(sideLength);

        Square square = new Square(Double.parseDouble(sideLength));
        square.printArea();
    }

    /**
     * Метод ввода данных для площади круга
     */
    private static void printCircleArea(Scanner scanner) {
        System.out.println("Введите радиус круга");
        String radius = scanner.nextLine();

        characterCheck(radius);

        Circle circle = new Circle(Double.parseDouble(radius));
        circle.printArea();
    }

    /**
     * Метод ввода данных для периметра квадрата
     */
    private static void printSquarePerimeter(Scanner scanner) {
        System.out.println("Введите длину стороны квадрата");
        String sideLength = scanner.nextLine();

        double symbol = Double.parseDouble(sideLength);
        if (symbol <= 0) {
            System.out.println("Ошибка! Вводимые значения должны быть положительными");
            return;
        }
        Square square = new Square(Double.parseDouble(sideLength));
        square.printPerimeter();
    }

    /**
     * Метод ввода данных для периметра круга
     */
    private static void printCirclePerimeter(Scanner scanner) {

        System.out.println("Введите радиус круга");
        String radius = scanner.nextLine();
        characterCheck(radius);
        Circle circle = new Circle(Double.parseDouble(radius));
        circle.printPerimeter();
    }

    /**
     * Метод проверяет вводимые символы
     * @param symbol
     */
    private static void characterCheck(String symbol) {

        double symbol1 = Double.parseDouble(symbol);
        if (symbol1 <= 0) {
            System.out.println("Ошибка! Вводимые значения должны быть положительными");
            return;
        }

    }

}

