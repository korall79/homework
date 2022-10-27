package lesson_8;

/***
 * Класс вычисляет площадь квадрата
 */
public class Square {

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

    }

