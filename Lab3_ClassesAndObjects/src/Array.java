public class Array {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        ArrayTools numChange = new ArrayTools(numbers);

        System.out.println("Before modification:");
        numChange.printArray();

        numChange.modifyValues();

        System.out.println("After modification:");
        numChange.printArray();

        System.out.println("Sum of array vals (after mod): " + numChange.arrSum());
    }
}
