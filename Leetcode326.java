import java.util.Scanner;

public class Leetcode326 {

    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;  // 3^0 = 1, so it is a power of three
        if (n <= 0) return false; // Negative or zero can't be powers of three
        if (n % 3 == 0) {
            return isPowerOfThree(n / 3);  // Recursively divide by 3
        }
        return false;  // If not divisible by 3, it is not a power of three
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an instance of Solution
        Leetcode326 solution = new Leetcode326();
        
        // Take user input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();  // Read an integer from the user

        // Check if the number is a power of three
        if (solution.isPowerOfThree(n)) {
            System.out.println(n + " is a power of three.");
        } else {
            System.out.println(n + " is not a power of three.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
