package lesson_16.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> ageMap = new HashMap<>();

        ageMap.put("Bill", 34);
        ageMap.put("John", 23);
        ageMap.put("Stan",56);

        System.out.println(ageMap);

        System.out.println(ageMap.get("John"));
    }
}
