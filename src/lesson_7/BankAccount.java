package lesson_7;

/***
 * Класс, оисывающий банковский аккаунт
 */
public class BankAccount {
    /**
     * Идентификатор аккаунта
     */
    private int id;

    /**
     * Имя владельца
     */
    private String ownerName;

    /**
     * Остаток средств
     */
    private double moneyAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            System.out.println("Идентификатор не может быть нулем и отрцательным значением");
        }
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

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

    /***
     * Конструктор без параметров
     *
     */
    public BankAccount() {

    }

    /**
     * метод выводит в консоль информацию об аккаунте
     */
    public void printInfo() {
        System.out.printf(" Аккаунт, идентификатор %d, имявладельца %s, остаток - %.2f\n",
                id, ownerName, moneyAmount);
    }

    /**
     * Метод зачисляет денежную сумму на счет
     *
     * @param money сумма пополнения
     */
    public void addMoneyToAccount(double money) {
        moneyAmount += money;
        System.out.println(" Счет пополнен успешно, остаток по счету -" + moneyAmount);
    }

    /**
     * Метод снимает денежную сумму со счета
     *
     * @param money сумма снятия
     */
    public boolean getMoneyFromAccount(double money) {
        if (money > moneyAmount) {
            System.out.println("Ошибка! Недостаточно средств на счете!");
            return false;
        }
        moneyAmount -= money;
        System.out.println("Снятие успешно. Остаток по счету -" + moneyAmount);
        return true;
    }

    /**
     * Метод переводит денеьги со счета на счет
     *
     * @param account счет получателя
     * @param money   сумма перечисления
     */
    public void sendMoneyFromAccountToAccount(BankAccount account, double money) {
        if (getMoneyFromAccount(money)){
            account.addMoneyToAccount(money);
        }
    }
}
