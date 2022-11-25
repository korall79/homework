package lesson_13.task_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String orange = "Orange";

        words.add(orange);
        words.add("Banana");
        words.add("Potato");

        words.add(1,"Carrot");

        System.out.println(words);

        System.out.println(words.get(2));

        HashSet<String> words1 = new HashSet<>();
        words1.add(orange);
        words1.add("Carrot");
        words1.add("Banana");
        words1.add("Potato");

        System.out.println(words1);
    }
}
