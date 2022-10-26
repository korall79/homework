package homework_7;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("Barsic", 1, "whit");
        Cat marusia = new Cat("Marusia", "grey");
        Cat vasia = new Cat("brown");

        barsic.catInfo();
        marusia.catInfo();
        vasia.catInfo();

        System.out.println();
        barsic.say();
        marusia.say();
        vasia.say();

        System.out.println();
        barsic.eat(5);
        marusia.eat(10);
        vasia.eat(1);

    }
}
