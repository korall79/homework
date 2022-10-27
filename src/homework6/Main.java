package homework6;

public class Main {
    public static void main(String[] args) {
        Methods.areaTriangle(3, 4,5.243);

        Methods.countOfLetters("Привет, как дела?");
        System.out.println(Methods.vowelsCount("Привет, как дела?"));

        Methods.rombus(new int[5][5]);
        System.out.println();
        Methods.printRhombus(3);
        System.out.println();

        Methods.massive(new int[2][3]);
        System.out.println();

        int[][]array = {{1,2,3},{4,5,6},{7,8,9}};
        Methods.printArray(array);


    }
}
