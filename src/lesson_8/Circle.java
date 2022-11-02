package lesson_8;

import java.util.Objects;

/***
 * Класс вычисляет площадь круга
 */
public class Circle extends FigureCalculations {

    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    /**
     *Метод расчитывает площадь круга
     */@Override
    public void printArea(){
        System.out.println("Площадь круга равна "+ (Math.PI*radius*radius));
    }

    /**
     * Метод расчитывает параметр круга
     */
    @Override
    public void printPerimeter() {
        System.out.println("Периметр окружности равен "+(2*Math.PI*radius));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius;
    }
}
