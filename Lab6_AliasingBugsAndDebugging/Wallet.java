import java.util.ArrayList;

public class Wallet {
    
    private ArrayList<Money> contents = new ArrayList<>();
    private ArrayList<Integer> itemIDs = new ArrayList<>();

    public void addMoney(Money m, int id) {
        contents.add(m);
        itemIDs.add(id);
    }

    public Money sumAll() {
        Money total = contents.get(0); 
        for (int i = 1; i < contents.size(); i++) {
            total.add(contents.get(i)); 
        }
        return total; 
    }

    public boolean compareWallets(Wallet other) {
        // Why here is wrong? => Wallet.sumAll() is incorrect because Wallet is the class while sumAll is an instance method and requires specific wallet to work on
        // To fix: either change to this.sumAll() to specify you want to use specific wallet instance or just sumAll()
        Money myTotal = sumAll(); 
        Money otherTotal = other.sumAll();

        if (!myTotal.isEqualTo(otherTotal)) { 
            return false;
        }
        return true;
    }

    public void printAll() {
        System.out.println("Current Wallet Contents:");
        for (int i = 0; i < contents.size(); i++) {
            System.out.println("ID " + itemIDs.get(i) + ": " + contents.get(i));
        }
    }

    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        w1.addMoney(new Money(9, 0), 101);
        w1.addMoney(new Money(4, 100), 102);
        
        Wallet w2 = new Wallet();
        w2.addMoney(new Money(10, 0), 201);
        w2.addMoney(new Money(4, 0), 202);
        
        System.out.println("Before sum: ");
        System.out.println("Wallet 1: "); 
        w1.printAll();
        System.out.println("Wallet 2: "); 
        w2.printAll();
        System.out.println();
        
        // Are their sum same?
        System.out.println("Total money in Wallet 1 is: " + w1.sumAll()); 
        System.out.println("Total money in Wallet 2 is: " + w2.sumAll()); 
        System.out.println();        
        
        // Are item values changed after sum?
        System.out.println("After sum: ");
        System.out.println("Wallet 1: "); 
        w1.printAll();
        System.out.println("Wallet 2: "); 
        w2.printAll();
        System.out.println();

        // Now if w1 and w2 are equal?
        if (w1.compareWallets(w2)) {
            System.out.println("Wallets are equal!");
        } else {
            System.out.println("Wallets are different!");
        }
  
    }
}