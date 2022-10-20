package homework6;


public class Methods {
    /**
     * метод выводить на консоль площадь треугольника
     *
     * @param sideA
     * @param sideB area площадь треуг
     */
    public static void areaTriangle(double sideA, double sideB) {
        double area = sideA * sideB / 2;
        System.out.println("Площадь треугольника:" + area);
    }
    /**
     * возвращает количество глассных букв в тексте
     */
    public static void countOfLetters(String text) {
        int count = 0;
        count = text.replaceAll("(?i)[^аеёиоуэюя]", "").length();
        System.out.println("Количество глассных букв в тексте: " + count);
    }


    public static void rombus() {

    }

    public static void massive() {

    }
}
