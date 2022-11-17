package lesson_11;

import java.util.Arrays;

public class PhoneBook {
    private int size = 10;
    private  int counter=0;
    private Contact [] contacts = new Contact[size];

    public PhoneBook() {
    }

    public void setContact(Contact c){
        this.contacts [counter]=c;
        this.counter ++;
        if(counter>=size){
            this.size*=2;
            Contact [] temp = new Contact[size];
            for (int i = 0; i < contacts.length; i++) {
                temp[i]=contacts[i];

            }
            contacts=temp;
        }
    }

    @Override
    public String toString() {

        return "PhoneBook{" +
                "size=" + size +
                ", counter=" + counter +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
