package lesson_21.task_2;

import org.apache.log4j.Logger;

public class Main {

    private static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        int a = 63;
        int b = 7;

        printDiv(a, b);
    }

    private static void printDiv(int a, int b) {
        log.debug(String.format("Начало работы метода printDiv, переданы параметры %d, %d,", a, b));

        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            log.error("Ошибка! В качестве делимого в метод printDiv передан 0");
            throw e;
        }

        System.out.println("Частное двух чисел - " + (a / b));
        log.debug(String.format("Конец работы метода printDiv, метод завершил работу срезультатом %d,", result));
    }
}
