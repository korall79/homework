package homework6;


public class Methods {
    /**
     * метод выводить на консоль площадь треугольника
     *
     * @param sideA сторона
     * @param sideB
     * area площадь треуг
     */
    public static void areaTriangle(double sideA, double sideB) {
        double area = sideA * sideB / 2;
        System.out.println("Площадь треугольника:" + area);
    }
    /**
     * возвращает количество глассных букв в тексте
     * (? i) сделает символ нечувствительным к регистру
     * Регулярное выражение ("(?i)[^aeёио]"), используемое в методе String # replaceAll ()
     * в основном сообщает методу заменить все символы пустой строкой ( "" ),
     * которая не является a , e , ё , o или u независимо от регистра букв.
     * Затем мы берем оставшееся количество символов (которые будут всеми гласными)
     * в качестве подсчета количества гласных в слове или строке, поскольку они были
     * единственными символами, которые не были заменены:
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
