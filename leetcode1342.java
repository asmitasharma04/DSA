package recursion;

public class leetcode1342 {
    
        public int numberOfSteps(int num) {
            return helper(num, 0);
        }
    
        // Helper function to count steps recursively
        public int helper(int num, int steps) {
            if (num == 0) {
                return steps;
            }
            if (num % 2 == 0) {
                return helper(num / 2, steps + 1);
            } else {
                return helper(num - 1, steps + 1);
            }
        }
    
        public static void main(String[] args) {
            leetcode1342 sol = new leetcode1342();
            int testNumber = 14;
            System.out.println("Number of steps to reduce " + testNumber + " to zero is: " + sol.numberOfSteps(testNumber));
        }
    }
    

