package lesson_7;

/***
 * Класс, оисывающий банковский аккаунт
 */
public class BankAccount {
    /**
     * Идентификатор аккаунта
     */
    public int id;

    /**
     * Имя владельца
     */
    public String ownerName;

    /**
     * Остаток средств
     */
    public double moneyAmount;

    /***
     * Конструктор
     *
     * @param id        идентификатор аккаунта
     * @param ownerName     имя владельца
     * @param moneyAmount       остаток на счете
     */

    public BankAccount(int id, String ownerName, double moneyAmount) {
        this.id = id;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
        System.out.println("Вызван конструктор с термя параметрами");

    }
    /***
     * Конструктор
     *
     * @param id        идентификатор аккаунта
     * @param ownerName     имя владельца
     */

    public BankAccount(int id, String ownerName) {
        this.id = id;
        this.ownerName = ownerName;
    }
}
