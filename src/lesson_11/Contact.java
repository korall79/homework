package lesson_11;

class Contact {
    private String name;
    private String phoneNumber;

    PhoneBook phoneBook = new PhoneBook();

    public Contact(String name) {
        this.name = name;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        if(phoneNumber.length()!=11 && phoneNumber.length()!=12){//на дом
            //поднять ощибку
            System.out.println("Error");

        }
    }
}
