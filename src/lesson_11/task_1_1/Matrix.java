package lesson_11.task_1_1;

/**
 * Класс для работы с матрицами
 */
//public class Matrix implements IMatrix {
//
//    /**
//     * Внутренний двухмерный массив, представляющий собой содержимое матрицы
//     */
//    private double[][] matrix;
//
//    /**
//     * Конструктор
//     *
//     * @param rows      количество строк
//     * @param columns   количество столбцов
//     */
//    public Matrix(int rows, int columns) {
//
//        // Проверяем переданные значения количества строк и столбцов
//        // Если они некорректны, присваиваем им значение по умолчанию,
//        // которое определено в интерфейсе IMatrix
//        if (rows < 1) {
//            System.out.println("Ошибка! Количество строк не может быть нулём или отрицательным значением!");
//            rows = IMatrix.DEFAULT_MATRIX_SIZE;
//        }
//        if (columns < 1) {
//            System.out.println("Ошибка! Количество столбцов не может быть нулём или отрицательным значением!");
//            columns = IMatrix.DEFAULT_MATRIX_SIZE;
//        }
//
//        // Инициализируем внутренний массив
//        matrix = new double[rows][columns];
//    }
//
//    /**
//     * Конструктор
//     *
//     * @param matrix массив с содержимым матрицы
//     */
//    public Matrix(double[][] matrix) {
//
//        // Если переданный массив имеет некорректные размеры, инициализируем
//        // внутренний массив массивом с размерами по умолчанию
//        if (matrix.length < 1 || matrix[0].length < 1) {
//            System.out.println("Ошибка! Передан массив с некорректными размерами!");
//            this.matrix = new double[IMatrix.DEFAULT_MATRIX_SIZE][IMatrix.DEFAULT_MATRIX_SIZE];
//        } else { // иначе инициализируем переданным массивом
//            this.matrix = matrix;
//        }
//    }
//
//    /**
//     * Метод возвращает количество строк матрицы
//     * @return количество строк
//     */
//    @Override
//    public int getRows() {
//
//        // Количество строк соответствует размеру внутреннего двухмерного массива
//        return matrix.length;
//    }
//
//    /**
//     * Метод возвращает количество столбцов матрицы
//     * @return количество столбцов
//     */
//    @Override
//    public int getColumns() {
//
//        // Количество столбцов соответствует размеру одномерного массива,
//        // который содержится в любой из ячеек двухмерного массива.
//        // Берём самый первый, потому что он точно существует.
//        return matrix[0].length;
//    }
//
//    /**
//     * Метод возвращает значение, находящееся в ячейке с указанными индексами
//     *
//     * @param rowIndex  индекс строки
//     * @param colIndex  индекс столбца
//     * @return          значение ячейки
//     */
//    @Override
//    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
//
//        // Проверка, не превышают ли переданные индексы размеры матрицы.
//        if (rowIndex >= getRows() || colIndex >= getColumns()) {
//            throw new IndexOutOfBoundsException("Ошибка! Индексы превышают размер матрицы.");
//        }
//
//        // Возвращаем значение из внутреннего массива по переданным индексам.
//        return matrix[rowIndex][colIndex];
//    }
//
//    /**
//     * Метод присваивает переданное значение элементу матрицы по индексам
//     *
//     * @param rowIndex  индекс строки
//     * @param colIndex  индекс столбца
//     * @param value     новое значение элемента
//     */
//    @Override
//    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
//
//        // Проверка, не превышают ли переданные индексы размеры матрицы.
//        if (rowIndex >= getRows() || colIndex >= getColumns()) {
//            System.out.println("Ошибка! Индексы превышают размер матрицы.");
//            return;
//        }
//
//        // Присваиваем полученное значение элементу массива по переданным индексам.
//        matrix[rowIndex][colIndex] = value;
//    }
//
//    /**
//     * Метод суммирует две матрицы
//     *
//     * @param otherMatrix   второй аргумент (матрица)
//     * @return              результирующая матрица
//     */
//    @Override
//    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//
//        // Проверка, имеют ли матрицы одинаковые размеры
//        if (getRows() != otherMatrix.getRows() || getColumns() != otherMatrix.getColumns()) {
//            System.out.println("Ошибка! Складывать можно только одинаковые по размеру матрицы.");
//            return null;
//        }
//
//        // Создаём объект результирующей матрицы
//        IMatrix result = new Matrix(getRows(), getColumns());
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getColumns(); j++) {
//
//                // Вычисляем сумму ячеек двух матриц с одинаковыми индексами
//                double sum = getValueAt(i, j) + otherMatrix.getValueAt(i, j);
//
//                // Присваиваем сумму элементу результирующей матрицы с такими же индексами
//                result.setValueAt(i, j, sum);
//            }
//        }
//
//        // Возвращаем результирующую матрицу
//        return result;
//    }
//
//    /**
//     * Метод производит вычитание матриц
//     *
//     * @param otherMatrix   второй аргумент (матрица)
//     * @return              результирующая матрица
//     */
//    @Override
//    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//
//        // Проверка, имеют ли матрицы одинаковые размеры
//        if (getRows() != otherMatrix.getRows() || getColumns() != otherMatrix.getColumns()) {
//            System.out.println("Ошибка! Складывать можно только одинаковые по размеру матрицы.");
//            return null;
//        }
//
//        // Создаём объект результирующей матрицы
//        IMatrix result = new Matrix(getRows(), getColumns());
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getColumns(); j++) {
//
//                // Вычисляем разность ячеек двух матриц с одинаковыми индексами
//                double sub = getValueAt(i, j) - otherMatrix.getValueAt(i, j);
//
//                // Присваиваем результат элементу результирующей матрицы с такими же индексами
//                result.setValueAt(i, j, sub);
//            }
//        }
//
//        // Возвращаем результирующую матрицу
//        return result;
//    }
//
//    /**
//     * Метод производит умножение матриц
//     *
//     * @param otherMatrix   второй аргумент (матрица)
//     * @return              результирующая матрица
//     */
//    @Override
//    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//
//        // Проверяем матрицы на совместимость.
//        // Матрицы совместимы, если число столбцов первой матрицы равно числу строк второй.
//        if (getColumns() != otherMatrix.getRows()) {
//            System.out.println("Ошибка! Матрицы несовместимы!");
//            return null;
//        }
//
//        // Создаём результирующую матрицу.
//        // Число её строк равно числу строк первой матрицы,
//        // а число её столбцов равно числу столбцов второй матрицы
//        Matrix result = new Matrix(getRows(), otherMatrix.getColumns());
//
//        // Стандартно проходим циклом по результирующей матрице
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getColumns(); j++) {
//
//                // Объявляем переменную для вычисления значения текущей ячейки
//                double value = 0;
//
//                // Третьим вложенным циклом проходимся по соответствующей строке первой матрицы
//                // и соответствующему столбцу второй матрицы и вычисляем значение ячейки.
//                // Вообще не самый простой алгоритм, поэтому кроме дебага рекомендую
//                // в интернете посмотреть наглядно, как происходит умножение матриц
//                for (int k = 0; k < getColumns(); k++) {
//                    value += getValueAt(i, k) * otherMatrix.getValueAt(k, j);
//                }
//
//                // Сохраняем значение ячейки, вычисленное в третьем цикле,
//                // в соответствующую ячейку результирующей матрицы
//                result.setValueAt(i, j, value);
//            }
//        }
//
//        // Возвращаем результирующую матрицу
//        return result;
//    }
//
//    /**
//     * Метод производит умножение матрицы на число
//     *
//     * @param value число
//     * @return      результирующая матрица
//     */
//    @Override
//    public IMatrix mul(double value) {
//
//        // Создаём объект результирующей матрицы
//        IMatrix result = new Matrix(getRows(), getColumns());
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getColumns(); j++) {
//
//                // Умножаем значение ячейки на переданное число
//                double mul = getValueAt(i, j) * value;
//
//                // Присваиваем значение ячейке результирующей матрицы
//                result.setValueAt(i, j, mul);
//            }
//        }
//
//        // Возвращаем результирующую матрицу
//        return result;
//    }
//
//    /**
//     * Метод транспонирует матрицу
//     *
//     * @return транспонированная матрица
//     */
//    @Override
//    public IMatrix transpose() {
//
//        // Создаём результирующую матрицу, у которой количество столбцов
//        // равно количеству строк исходной матрицы, и наоборот, количество
//        // строк равно количеству столбцов исходной матрицы
//        Matrix result = new Matrix(getColumns(), getRows());
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < result.getRows(); i++) {
//            for (int j = 0; j < result.getColumns(); j++) {
//
//                // Получаем значение из ячейки исходной матрицы.
//                // Индексы тут "перепутаны" местами, потому что
//                // матрица у нас транспонированная, т.е. отражённая
//                // относительно главной диагонали
//                double value = getValueAt(j, i);
//
//                // Устанавливаем в ячейку результирующей матрицы
//                // значение из соответствующей ячейки исходной матрицы
//                result.setValueAt(i, j, value);
//            }
//        }
//
//        // Возвращаем результирующую матрицу
//        return result;
//    }
//
//    /**
//     * Метод заполняет матрицу переданным значением
//     * @param value значение
//     */
//    @Override
//    public void fillMatrix(double value) {
//
//        // Тут всё просто, думаю, ничего объяснять не нужно.
//        for (int i = 0; i < getRows(); i++) {
//            for (int j = 0; j < getColumns(); j++) {
//                setValueAt(i, j, value);
//            }
//        }
//    }
//
//    /**
//     * Метод вычисляет определитель матрицы
//     *
//     * @return определитель матрицы
//     */
//    @Override
//    public double determinant() {
//
//        // Для простоты договорились считать только определитель матрицы размером 2х2
//        if (2 != getColumns() || 2 != getRows()) {
//            System.out.println("Ошибка! Неверные размеры матрицы!");
//            return 0;
//        }
//
//        return getValueAt(0, 0) * getValueAt(1, 1)
//                - getValueAt(1, 0) * getValueAt(0, 1);
//    }
//
//    /**
//     * Метод определяет, является ли матрица нулевой
//     *
//     * @return true, если матрица нулевая
//     */
//    @Override
//    public boolean isNullMatrix() {
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < getRows(); i++) {
//            for (int j = 0; j < getColumns(); j++) {
//
//                // Если значение хотя бы одной ячейки не равно нулю,
//                // возвращаем false
//                if (0 != getValueAt(i, j)) {
//                    return false;
//                }
//            }
//        }
//
//        // Если прошли всю матрицу и не нашли ни одной ненулевой ячейки, возвращаем true
//        return true;
//    }
//
//    /**
//     * Метод определяет, является ли матрица единичной
//     *
//     * @return true, если матрица единичная
//     */
//    @Override
//    public boolean isIdentityMatrix() {
//
//        // Стандартный проход по двухмерному массиву
//        for (int i = 0; i < matrix.length; i ++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//
//                // Если мы находимся на главной диагонали (i == j),
//                // и при этом значение не равно 1, возвращаем false
//                // Если мы находимся не на главной диагонали (i != j),
//                // и при этом значение не равно 0, возвращаем false
//                if (i == j && matrix[i][j] != 1) {
//                    return false;
//                } else if (i != j && matrix[i][j] != 0){
//                    return false;
//                }
//            }
//        }
//
//        // Если прошли всю матрицу и не нашли ни одной некорректной ячейки, возвращаем true
//        return true;
//    }
//
//    /**
//     * Метод определяет, квадратная ли матрица
//     *
//     * @return true, если матрица квадратная
//     */
//    @Override
//    public boolean isSquareMatrix() {
//
//        // Здесь достаточно всего одной строки.
//        // Если количество строк равно количеству столбцов, вернётся true,
//        // иначе вернётся false
//        return getRows() == getColumns();
//    }
//
//    /**
//     * Метод выводит матрицу на консоль
//     */
//    @Override
//    public void printToConsole() {
//
//        // Тут всё просто, думаю, ничего объяснять не нужно.
//        for (double[] row : matrix) {
//            for (double cell : row) {
//                System.out.print(cell + "   ");
//            }
//            System.out.println();
//        }
//    }
//}
