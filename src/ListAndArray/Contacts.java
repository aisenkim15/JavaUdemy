package ListAndArray;

public class Contacts {

    private String name;
    private String phoneNum;

    public Contacts(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static Contacts createContact(String name, String phoneNum) {
        return new Contacts(name, phoneNum);
    }
}
