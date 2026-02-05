public class Array {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        
        System.out.println("Before modification:");
        printArray(numbers);
        
        modifyValues(numbers);
        
        System.out.println("After modification:");
        printArray(numbers);

        System.out.println("Sum of array vals (after mod): " + arrSum(numbers));
    }

    public static void modifyValues(int[] data) {
        for (int i = 0; i <= data.length - 1; i++) { 
            data[i] = data[i] * 2; 
        }
    }

    public static void printArray(int[] data) {
        for (int val : data) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Add a function to output the sum of the array
    public static int arrSum(int[] a){
        int total = 0;

        for(int i = 0; i < a.length; i++){
            total += a[i];
        }

        return total;
    }
}