package lesson_8;

public class Oval extends Circle{

    private double radius2;

    public Oval (double radius, double radius2){
       // super.setRadius(radius);
        //this.radius=radius;
        super(radius);
        this.radius2 = radius2;
    }

    /**
     * Метод вычисляет площадь овала
     */
    @Override
    public void printArea() {
        System.out.println("Площадь овала равна: " + (Math.PI*getRadius() * radius2));
    }

    /**
     * Метод вычисляет периметр овала
     */
    @Override
    public void printPerimeter() {
        System.out.println("Периметр овала равен: " +
                (4*(Math.PI*getRadius()*radius2 + getRadius()- radius2)/(getRadius()+radius2)));
    }
}
