public class Leetcode172 {
    // Method to count trailing zeroes in n!
    public static int trailingZeroes(int n) {
        int count = 0;
        
        // Keep dividing n by 5 to find the number of factors of 5 in n!
        while (n >= 5) {
            n /= 5;  // Divide n by 5 and update n
            count += n;  // Add the quotient (number of multiples of 5) to count
        }
        
        return count;  // Return the total count of trailing zeroes
    }

    // Main method (PSVM)
    public static void main(String[] args) {
        // Example usage
        int n = 100;  // You can change this value to test different inputs
        
        // Call the trailingZeroes method and print the result
        int result = trailingZeroes(n);
        System.out.println("The number of trailing zeros in " + n + "! is: " + result);
    }
}
