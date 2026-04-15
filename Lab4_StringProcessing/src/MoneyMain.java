public class MoneyMain {
	public static void main(String[] args) {
        Money m1 = new Money(5, 50); // Does not work because they are not the same object
        Money m2 = new Money(5, 50); // Compares same object storing same things

        // Do these two lines output true?
        System.out.println("Using ==: " + (m1 == m2)); 
        System.out.println("Using isEqualTo: " + m1.isEqualTo(m2));

        Money m3 = new Money(5, 5);
        Money m4 = new Money(1, 73);

        m2.add(m4);

        System.out.println("Money 3 is: " + m3); 
        System.out.println("Money 2 + Money 4 is: " + m2);
        
    }
}