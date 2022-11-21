package lesson__11.task_1;

public class Main {

    public static void main(String[] args) {


        Matrix matrix = new Matrix(3,3);

        double[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] array2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);

        matrix1.printToConsole();
        System.out.println();

        matrix2.printToConsole();
        System.out.println();

    }
}
