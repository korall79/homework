package lesson_8;

import java.util.Scanner;

public class Main {
    char[] symbols = null;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = null;


        while (!"0".equals(input)) {
            System.out.println("Введите фигуру (номер)\n" +
                    "1 - Площадь квадрата\n" +
                    "2 - Площадь круга\n" +
                    "3 - Периметр квадрата\n" +
                    "4 - Периметр круга\n" +
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
     * Метод ввода в консоль данных для квадрата
     *
     * @param scanner
     */
    private static void printSquareArea(Scanner scanner) {
        System.out.println("Введите длину стороны квадрата");
        String sideLength = scanner.nextLine();
        char[] symbols = sideLength.toCharArray();
        for (char symbol : symbols) {
            if (symbol == '-' || symbol == '0') {
                System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
                return;
            }
        }
        Square square = new Square(Double.parseDouble(sideLength));
        square.printArea();


    }

    /**
     * Метод ввода данных для площади круга
     *
     * @param scanner
     */
    private static void printCircleArea(Scanner scanner) {
        System.out.println("Введите радиус круга");
        String radius = scanner.nextLine();
        char[] symbols = radius.toCharArray();
        for (char symbol : symbols) {
            if (symbol == '-' || symbol == '0') {
                System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
                return;
            }
        }
        Circle circle = new Circle(Double.parseDouble(radius));
        circle.printArea();
    }
    /**
     * Метод ввода данных для периметра квадрата
     *
     * @param scanner
     */
    private static void printSquarePerimeter(Scanner scanner) {
        System.out.println("Введите длину стороны квадрата");
        String sideLength = scanner.nextLine();
        char[] symbols = sideLength.toCharArray();
        for (char symbol : symbols) {
            if (symbol == '-' || symbol == '0') {
                System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
                return;
            }
        }
        Square square = new Square(Double.parseDouble(sideLength));
        square.printPerimeter();
    }


    /**
     * Метод ввода данных для периметра круга
     *
     * @param scanner
     */
    private static void printCirclePerimeter(Scanner scanner) {
        System.out.println("Введите радиус круга");
        String radius = scanner.nextLine();
        char[] symbols = radius.toCharArray();
        for (char symbol : symbols) {
            if (symbol == '-' || symbol == '0') {
                System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
                return;
            }
        }
        Circle circle = new Circle(Double.parseDouble(radius));
        circle.printPerimeter();
    }




}

