package lesson_16.Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        Surname surname = new Surname("Kochurova Alis");
        Surname surname1 = new Surname("Kochurova Cofya");
        Surname surname2 = new Surname("Petrova Elena");

        List<Surname> lastNameList = new ArrayList<>();

        lastNameList.add(surname);
        lastNameList.add(surname1);
        lastNameList.add(surname2);

        HashMap<String,Surname>  map = new HashMap<>();
        map.put("454545", surname);
        map.put("787878",surname1);
        map.put("989898",surname2);

        System.out.println(map.get("787878"));



    }

}
