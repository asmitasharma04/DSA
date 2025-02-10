public class leetcode3174 {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (true) {
            boolean hasDigits = false;
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    hasDigits = true;
                    // Find the closest non-digit character to the left
                    for (int j = i - 1; j >= 0; j--) {
                        if (!Character.isDigit(sb.charAt(j))) {
                            sb.deleteCharAt(j); // Remove the non-digit character
                            sb.deleteCharAt(i - 1); // Remove the digit
                            break;
                        }
                    }
                    break;
                }
            }
            if (!hasDigits) {
                break;
            }
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        leetcode3174 sol = new leetcode3174();
        System.out.println(sol.clearDigits("abc"));  // Output: "abc"
        System.out.println(sol.clearDigits("cb34")); // Output: ""
        System.out.println(sol.clearDigits("b4y6")); // Output: ""
    }
}

