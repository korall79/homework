package lesson_8;

import java.util.Objects;

public class Triangle extends Square{

    private double heightTriangle;
    /**
     * Конструктор
     *
     * @param sideLength длина стороны
     */
    public Triangle(double sideLength, double heightTriangle) {
        super(sideLength);
        this.heightTriangle= heightTriangle;
    }

    @Override
    public void printArea() {
        System.out.println("Площадь треугольника равна: "+ getSideLength()*heightTriangle/2);
    }

//    @Override
//    public void printPerimeter() {
//        System.out.println("Периметр треугольника равен " +);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.heightTriangle, heightTriangle) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heightTriangle);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heightTriangle=" + heightTriangle +
                '}';
    }
}
