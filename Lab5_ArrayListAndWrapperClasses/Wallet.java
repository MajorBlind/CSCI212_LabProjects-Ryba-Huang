import java.util.ArrayList;

public class Wallet {
    
    private ArrayList<Money> contents = new ArrayList<>();
    
    // TODO: Create an ArrayList of Integers called itemIDs (Use the Integer wrapper class)
    private ArrayList<Integer> itemIDs = new ArrayList<>();

    public void addItem(Money item, int id) {
        contents.add(item);
        itemIDs.add(id);
    }

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        
        // TODO: Add at least two Money items with corresponding ID in myWallet
        myWallet.addItem(new Money(5, 25), 101);
        myWallet.addItem(new Money(2, 75), 102);
        
        System.out.println("Wallet Contents:");

        // TODO: Print each Money item and its corresponding ID in myWallet
        for (int i = 0; i < myWallet.contents.size(); i++) {
            Money item = myWallet.contents.get(i);
            Integer id = myWallet.itemIDs.get(i);
            System.out.println("ID " + id + ": " + item);
        }
    }
}
