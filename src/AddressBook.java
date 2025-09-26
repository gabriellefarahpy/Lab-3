import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies = new ArrayList();

    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            this.myBuddies.add(aBuddy);
        }

    }

    public BuddyInfo removeBuddy(int index) {
        return index >= 0 && index < this.myBuddies.size() ? (BuddyInfo)this.myBuddies.remove(index) : null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
