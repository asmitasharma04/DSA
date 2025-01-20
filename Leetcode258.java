public class Leetcode258 {

    // Method using modulo 9 to find the repeated sum of digits
    public int addDigits(int num) {
        // Base case: if num is 0, return 0
        if (num == 0) {
            return 0;
        }
        
        // If num is divisible by 9, the result is 9; otherwise, it's num % 9
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        Leetcode258 solution = new Leetcode258();
        
        // Test cases
        System.out.println(solution.addDigits(38));  // Output: 2
        System.out.println(solution.addDigits(0));   // Output: 0
        System.out.println(solution.addDigits(123)); // Output: 6
        System.out.println(solution.addDigits(999)); // Output: 9
    }
}
