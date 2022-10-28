package lesson_8;

/***
 * Класс вычисляет площадь круга
 */
public class Circle extends FigureCalculations {

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

    @Override
    public void printPerimeter() {
        System.out.println("Периметр окружности равен "+(2*Math.PI*radius));
    }
}
