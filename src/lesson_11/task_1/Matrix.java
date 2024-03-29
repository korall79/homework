package lesson_11.task_1;
//
//public  class Matrix implements IMatrix {
//
//    private double[][] matrix;
//
//    public Matrix(int rows, int columns) {
//        if (rows < 1 || columns < 1) {
//            System.out.println("Ошибка! количество рядов и колонок не меньше 1");
//            matrix = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
//        } else {
//            matrix = new double[rows][columns];
//        }
//
//    }
//
//    public Matrix(double[][] matrix) {
//        this.matrix = matrix;
//    }
//
//
//    @Override
//    public int getRows() {
//        return matrix.length;
//    }
//
//    @Override
//    public int getColumns() {
//        return matrix[0].length;
//    }
//
//    @Override
//    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
//        if (rowIndex >= getRows() || colIndex >= getColumns() || rowIndex < 0 || colIndex < 0) {
//            throw new IndexOutOfBoundsException("Ошибака! передан не вырный индекс");
//        }
//        return matrix[rowIndex][colIndex];
//    }
//
//    @Override
//    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
//        if (rowIndex >= getRows() || colIndex >= getColumns() || rowIndex < 0 || colIndex < 0) {
//            System.out.println("Ошибака! передан не верный индекс");
//        }
//        matrix[rowIndex][colIndex] = value;
//
//    }
//
//    @Override
//    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//
//
//        double[][] matrixSum = new double[matrix.length][matrix[0].length];
//        double[][] matrix2 = new double[3][3];
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                double numMatrix1 = matrix[i][j];
//                double numMatrix2 = matrix2[i][j];
//                double sum = numMatrix1 + numMatrix2;
//                matrixSum[i][j] = sum;
//
//            }
//        }
//
//        for (int i = 0; i < matrixSum.length; i++) {
//            for (int j = 0; j < matrixSum[i].length; j++) {
//                System.out.print(matrixSum[i][j] + "   ");
//            }
//            System.out.println();
//        }
//        IMatrix matrix = new Matrix(matrixSum);
//        return matrix;
//    }
//
//    @Override
//    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//        return null;
//    }
//
//    @Override
//    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//        return null;
//    }
//
//    @Override
//    public IMatrix mul(double value) {
//        return null;
//    }
//
//    @Override
//    public IMatrix transpose() {
//        return null;
//    }
//
//    @Override
//    public void fillMatrix(double value) {
//
//    }
//
//    @Override
//    public double determinant() {
//        return 0;
//    }
//
//    @Override
//    public boolean isNullMatrix() {
//        return false;
//    }
//
//    @Override
//    public boolean isIdentityMatrix() {
//        return false;
//    }
//
//    @Override
//    public boolean isSquareMatrix() {
//        return false;
//    }
//
//    @Override
//    public void printToConsole() {
//        for (double[] row : matrix) {
//            for (double cell : row) {
//                System.out.print(cell + "   ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
