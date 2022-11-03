package lesson_8;

import java.util.Objects;

public class Rectangle extends Square{

    private double sideWidth;
    /**
     * Конструктор
     *
     * @param sideLength длина стороны
     * @param sideWidth
     */
    public Rectangle(String sideLength, String sideWidth) {
        super(Double.parseDouble(sideLength));
        this.sideWidth= Double.parseDouble(sideWidth);
    }
    /**
     * Метод вычисляет площадь прямоугольника
     */
    @Override
    public void printArea() {
        System.out.println("Площадь прямоугольника равна: "+ getSideLength()*sideWidth);
    }
    /**
     * Метод вычисляет периметр прямоугольника
     */
    @Override
    public void printPerimeter() {
        System.out.println("Периметр прямоугольника равен " + (getSideLength()+sideWidth)*2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideWidth, sideWidth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideWidth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideWidth=" + sideWidth +
                '}';
    }
}
