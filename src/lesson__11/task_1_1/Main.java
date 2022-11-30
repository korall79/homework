package lesson__11.task_1_1;

public class Main {

    public static void main(String[] args) {

        double[][] array1 = new double[][]{{1, 1, 1, 1},
                                           {1, 1, 1, 2},
                                           {1, 1, 1, 3},
                                           {1, 1, 1, 4}};

        Matrix matrix1 = new Matrix(array1);

        double[][] array2 = new double[][]{{1, 2, 3,1},
                                           {4, 5, 6,1},
                                           {7, 8, 9,1},
                                           {0, 1, 2,1}};

        Matrix matrix2 = new Matrix(array2);

        double[][] array3 = new double[][]{{1, 2},
                                           {3, 4},
                                           {5, 6}};

        Matrix matrix3 = new Matrix(array3);

        System.out.println(matrix1.isNullMatrix());

        IMatrix result = matrix1.sub(matrix2);

        result.printToConsole();

        matrix1.getValueAt(3, 3);






    }
}
