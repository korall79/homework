package lesson_13.task_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(65);
        numbers.add(22);
        numbers.add(87);
        numbers.add(7);

//        for (int i = 0; i < numbers.size(); i++) {
//            System.out.println(numbers.get(i));
//        }
//        for (Integer number:numbers) {
//            System.out.println(number);
//        }

       Iterator<Integer>iterator=  numbers.iterator();
       while (iterator.hasNext()){
           Integer number= iterator.next();
           System.out.println(number);

           if (number==65){
               iterator.remove();
           }
       }
        System.out.println();

        System.out.println(numbers);
    }
}
