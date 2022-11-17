package lesson__11.task_1;

public class Main {

    public static void main(String[] args) {

        Matrix matrix = new Matrix(4,3);
        matrix.printToConsole();

        double[][] array = {{1,2,3},{4,5,6},{7,8,9},{3,2,1}};

        Matrix matrix1 = new Matrix(array);


        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());

        System.out.println(matrix1.getValueAt(1,2));
        matrix1.setValueAt(3,1,6);
        matrix1.printToConsole();
    }
}
