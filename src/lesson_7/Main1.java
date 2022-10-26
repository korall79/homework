package lesson_7;

public class Main1 {
    public static void main(String[] args) {
        BankAccount alis = new BankAccount(1,"Alis");
        BankAccount jon = new BankAccount();

        jon= alis;
        jon.setOwnerName("Jon");

        System.out.println(alis.getOwnerName());
        System.out.println(jon.getOwnerName());
    }
}
