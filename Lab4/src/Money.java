public class Money {
    
    private int dollars;
    private int cents;
    
    public Money(int dollars, int cents) {
        this.dollars = dollars + (cents / 100);
        this.cents = cents % 100;
    }

    public void add(Money other) {
        int totalCents = this.cents + other.cents;
        int extraDollars = totalCents / 100;
        
        this.cents = totalCents % 100;
        this.dollars = this.dollars + other.dollars + extraDollars;
    }

    // Improve this function to handle m3
    // Handled m3 by using a ternary conditional to add "0" if cents < 10 and uses empty string if condition is false
    public String toString() {
        String centsString = (cents < 10 ? "0" : "") + cents;
        return "$" + dollars + "." + centsString;
    }

    // Implement this function
    public boolean isEqualTo(Money other) {
         return this.dollars == other.dollars && this.cents == other.cents;
    }

}