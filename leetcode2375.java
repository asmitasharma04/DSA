import java.util.*;
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int digit = 1;

        for (char ch : pattern.toCharArray()) {
            stack.push(digit++);
            if (ch == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        stack.push(digit);
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.smallestNumber("IIIDIDDD")); // Output: 123549876
        System.out.println(solution.smallestNumber("DDD")); // Output: 4321
    }
}
