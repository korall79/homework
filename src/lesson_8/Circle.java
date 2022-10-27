package lesson_8;

/***
 * Класс вычисляет площадь круга
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     *
     */
    public void printArea(){
        System.out.println("Площадь круга равна "+ (Math.PI*radius*radius));
    }
}
