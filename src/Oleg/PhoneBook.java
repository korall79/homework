package Oleg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;

public class PhoneBook extends ArrayList<PhoneBook> {

    private String surName;

    //private Integer number;

    public PhoneBook(String surName) {
        this.surName = surName;
       //this.number = nummber;
    }

    @Override
    public String toString() {
        return surName + '\'';
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }
}
