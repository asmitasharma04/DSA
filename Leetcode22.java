import java.util.*;

public class Leetcode22 {
    
    // Main method to run the program
    public static void main(String[] args) {
        Leetcode22 solution = new Leetcode22();
        int n = 3;  // You can change n to test with other values
        List<String> result = solution.generateParenthesis(n);
        
        // Printing the result
        System.out.println("Valid parentheses combinations for n = " + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
    
    // Function to generate all valid parentheses combinations
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);  // Start with an empty string and 0 open and close parentheses
        return result;
    }
    
    // Helper function to generate parentheses combinations recursively
    private void generate(List<String> result, String current, int open, int close, int n) {
        // Base case: when the current string reaches 2*n characters, it's a valid combination
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // If we can still add opening parentheses, do it
        if (open < n) {
            generate(result, current + "(", open + 1, close, n);  // Add '(' and recurse
        }

        // If we can add a closing parenthesis, do it
        if (close < open) {
            generate(result, current + ")", open, close + 1, n);  // Add ')' and recurse
        }
    }
}
