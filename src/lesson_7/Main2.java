package lesson_7;

public class Main2 {
    public static void main(String[] args) {
        BankAccount max = new BankAccount(1, "Max", 30);
        BankAccount ivan = new BankAccount(1, "Ivan", 50);

        max.printInfo();
        ivan.printInfo();
        System.out.println();

        max.addMoneyToAccount(10);
        max.printInfo();
        System.out.println();

        max.getMoneyFromAccount(70);
        max.printInfo();
        System.out.println();

        max.getMoneyFromAccount(16);
        max.printInfo();
        System.out.println();

        max.printInfo();
        ivan.printInfo();
        System.out.println("Тестирование перечисления");
        max.sendMoneyFromAccountToAccount(ivan,10);
        max.printInfo();
        ivan.printInfo();
    }
}
