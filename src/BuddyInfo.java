public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo() {
    }
    public BuddyInfo(String name, String address, String phone_number) {
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone_number() {
        return phone_number;
    }

    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        BuddyInfo Buddy1;
        Buddy1 = new BuddyInfo("John", "1234 River Rd", "6138439083");
        System.out.println("Hello" + ' ' + Buddy1.getName());

    }
}
