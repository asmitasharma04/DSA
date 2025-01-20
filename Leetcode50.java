public class Leetcode50 {
    // Public method to calculate x raised to the power n
    public double myPow(double x, int n) {
        // Handle the case where n is negative
        if (n < 0) {
            x = 1 / x;  // Compute the reciprocal for negative powers
            n = -n;     // Convert n to positive for easier computation
        }

        // Call the helper function to calculate x^n using recursion
        return pow(x, n);
    }

    // Private helper function to calculate power recursively
    private double pow(double x, int n) {
        // Base case: if n is 0, x^0 is always 1
        if (n == 0) {
            return 1;
        }

        // Recursively calculate the power of x^(n / 2)
        double half = pow(x, n / 2);

        // If n is even, the result is half * half
        // If n is odd, we multiply the result by one more x
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        Leetcode50 solution = new Leetcode50();

        // Test cases
        System.out.println(solution.myPow(2.00000, 10));   // Output: 1024.00000
        System.out.println(solution.myPow(2.10000, 3));    // Output: 9.26100
        System.out.println(solution.myPow(2.00000, -2));   // Output: 0.25000
    }
}
