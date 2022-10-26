package homework_7;

/***
 * Класс описывающий кота
 */
public class Cat {
    private String name;
    private int age;
    private String color;

    /**
     * Метод выводит информацию о коте в консоль
     */
    public void catInfo() {
        if (name != null && age!= 0 && color!=null) {
            System.out.printf("Имя кота - %s, возраст кота - %d год, цвет кота - %s\n", name, age, color);
        }
        else if (name != null && age== 0 && color!=null) {
            System.out.printf("Имя кота - %s,  цвет кота - %s\n", name,  color);
        }
        else if (name == null && age== 0 && color!=null){
            System.out.printf("цвет кота - %s\n",  color);
        }
      }

    /**
     * Метод кот мяукает
     */
    public void say() {
        System.out.println("Мяу мяу");
    }

    /**
     * Метод , который кормит кота. Если еду 10 и больше, то кот сытый. Иначе выводит в консоль что кот еще голодный
     * @param food количество еды
     */
    public void eat( int food) {
        if (food >= 10) {
            System.out.printf("Кот %s сытый\n", getName());
        } else {
            System.out.printf("Кот %s еще голодный\n", getName());
        }
    }

    /**
     * Конструктор , позволяющий создать кота со всеми параметрами
     *
     * @param name  имя кота
     * @param age   возраст кота
     * @param color цвет кота
     */
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Конструктор, позволяющий создать кота с параметром ЦВЕТ (для незнакомого кота)
     *
     * @param color цвет кота
     */
    public Cat(String color) {
        this.color = color;
    }

    /**
     * Конструктор, позволяющий создать кота с именем и цветом (для тех котов, возраст которых неизвестен)
     *
     * @param name  имя кота
     * @param color цвет кота
     */
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        if (name!=null){
            return name;
        }else return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
