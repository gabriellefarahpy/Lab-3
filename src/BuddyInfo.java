
public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo() {
        this("Default Name", "Default Address", "000-000-0000");
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-1234");
        System.out.println("Hello " + buddy.getName());
    }
}
