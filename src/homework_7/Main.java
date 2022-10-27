package homework_7;

public class Main {
    public static void main(String[] args) {
        Cat barsic = new Cat("Barsic", 1, "whit");
        Cat marusia = new Cat("Marusia", "grey");
        Cat brownCat = new Cat("brown");

        barsic.catInfo();
        marusia.catInfo();
        brownCat.catInfo();

        System.out.println();
        barsic.say();
        marusia.say();
        brownCat.say();

        System.out.println();
        barsic.eat(-5);
        marusia.eat(10);
        brownCat.eat(1);

    }
}
