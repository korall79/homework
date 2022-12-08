package Oleg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
//    Collection<ArrayList<PhoneBook>> values() {
//        return values();
//    }

//    public void get(String s){
//        return;
//    }


    public static void main(String[] args) {

        PhoneBook phone = new PhoneBook("Oleg");
        PhoneBook phone1 = new PhoneBook("Alisa");
        PhoneBook phone2 = new PhoneBook("Roman");
        PhoneBook phone3 = new PhoneBook("Sofya");


        ArrayList<PhoneBook> num = new ArrayList<>();

        num.add(phone);
        num.add(phone1);
        num.add(phone2);
        num.add(phone3);


        //System.out.println(num);


        HashMap<Integer, ArrayList<PhoneBook>> mup = new HashMap<>();
        //HashMap<Integer, String> f = new HashMap<>();
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();


        mup.put(891201028, phone);
        mup.put(891246280, phone1);
        mup.put(891990914, phone2);
        mup.put(898212875, phone3);
        for (Object z: mup.values()) {
            if (mup.containsValue(s)) {
                System.out.println();
            }
        }


        System.out.println(mup);


    }
}
