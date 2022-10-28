package lesson_8;

/***
 * Класс вычисляет площадь квадрата
 */
public class Square extends FigureCalculations {

    private double sideLength;

    /**
     * Конструктор
     * @param sideLength        длина стороны
     */
    public Square(double sideLength) {
//        if (sideLength<=0){
//            System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
//            return;
//        }else {
          this.sideLength = sideLength;
        }

    /**
     * Метод вычисляет площадь
     */
    public void printArea(){
//        if (sideLength<=0){
//            System.out.println("Ошибка! Длина стороны квадрата должна быть положительной");
//            return ;
//        }else {
            System.out.println("Площадь квадрата равна "+ (sideLength*sideLength));
        }

    @Override
    public void printPerimeter() {
        System.out.println("Периметр квадрата равен "+ (sideLength*4));
    }

}

