package lesson_20.task_1;

public class Car {

    //1. обычный класс(не вложенный)
    //2. Nested - влож
    //3. Static nested-статич влож класс
    //4 local nested - локальный вложенный
    //5 Anonymous nested- анонимный  класс

    private String vendor;
    private String color;
    private Engine engine;

    public Car(String vendor, String color, int horsePower, String engineType) {
        this.vendor = vendor;
        this.color = color;

        this.engine = new Engine(horsePower,engineType);

    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printInfo(){
        System.out.println("Характеристика автомобиля:");
        System.out.println("Производитель"+vendor);
        System.out.println("цвет" +color);
        System.out.println("Мощность двигателя"+ engine.horsePower);
        System.out.println("Тип двигателя"+ engine.type);
    }

    private static class Engine{
        private int  horsePower;
        private  String type;

        public Engine(int horsePower, String type) {
            this.horsePower = horsePower;
            this.type = type;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
