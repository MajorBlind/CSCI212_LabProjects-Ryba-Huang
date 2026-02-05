public class ArrayTools {
    // add instance variable and constructor
    int[] numbers;
    public ArrayTools(int[] numbers){
        this.numbers = numbers;
    }

    // move the modification and print function to this class
    public void modifyValues() {
        for (int i = 0; i < numbers.length; i++) { 
            numbers[i] = numbers[i] * 2; 
        }
    }

    public void printArray() {
        for (int val : numbers) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Output the sum of the array
    public int arrSum() {
        int total = 0;
        for (int val : numbers) {
            total += val;
        }
        return total;
    }
}
