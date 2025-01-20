package recursion;

public class SkipApple {
    public static void main(String[] args) {
        System.out.println(skip("bdapplefg")); // This will print "bdfg"
    }

    // Method to skip the substring "apple" and return the result string
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skip(up.substring(5)); // Skip the substring "apple"
        } else {
            char ch = up.charAt(0);
            return ch + skip(up.substring(1)); // Recursively process the rest of the string
        }
    }
}
