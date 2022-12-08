package lesson_17.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");

        String login = scanner.nextLine();
        if (login.length()>0){
            checkLogin(login);
        }else {
            checkLogin(null);
        }
    }

    private static void checkLogin (String login){
        if(login==null){
            return;
        }
        if("admin".equals(login)){
            System.out.println("Привет, админ");

        }else {
            System.out.println("Привет, гость");
        }
    }
}
