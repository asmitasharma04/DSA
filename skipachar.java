
package recursion;
public class skipachar {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip("baccad"));
    }

    // Method to skip 'a' while printing the result
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // Method to skip 'a' and return the result as a string
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
