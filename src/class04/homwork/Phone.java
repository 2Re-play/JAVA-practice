package class04.homwork;

public class Phone {
    private String name;
    private String phoneNumber;

    public Phone (String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName () {
        return name;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }
}
