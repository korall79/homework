package homework6;


public class Methods {
    /**
     * 1.метод выводить на консоль площадь треугольника
     *
     * @param sideA сторона
     * @param sideB area площадь треуг
     */
    public static void areaTriangle(double sideA, double sideB) {
        double area = sideA * sideB / 2;
        System.out.println("Площадь треугольника:" + area);
    }

    /**
     * 2.возвращает количество глассных букв в тексте
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
        System.out.println("Количество глассных букв в тексте: "+text+"-" + count);
    }

    /**
     * 3.Метод должен выводить фигуру ромба в консоль
     */
    public static void rombus(int[][] size) {
        if (size.length != size[0].length || size.length % 2 == 0) {
            System.out.println("Ошибка! Массив должен быть квадратным и нечетной длины.");
            return;
        }

        int startIndex = size.length / 2;
        int endIndex = startIndex;

        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {

//                if ((i + j) >= romb[i].length / 2 && (j - i) <= romb[i].length / 2 && (i - j) <= romb[i].length / 2)

                if (j >= startIndex && j <= endIndex)
                    size[i][j] = 1;
                System.out.print(size[i][j] + "  ");
            }

            if (i < size.length / 2) {
                startIndex--;
                endIndex++;

            } else {
                startIndex++;
                endIndex--;

            }
            System.out.println();
        }
    }

    /**
     * 4.Метод должен печатать на консоль двухмерный массив, который передают входящимпараметром
     *
     * @param sizeMassive размер массива
     */
    public static void massive(int[][] sizeMassive) {
        for (int i = 0; i < sizeMassive.length; i++) {
            for (int j = 0; j < sizeMassive[i].length; j++) {
                System.out.print(sizeMassive[i][j] + "  ");
            }
            System.out.println();
        }
    }
}