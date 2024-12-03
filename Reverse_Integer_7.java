public class Reverse_Integer_7 {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int digit = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0; // Return 0 to indicate overflow
            }
            ans = ans * 10 + digit;
            x = x / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Reverse_Integer_7 solution = new Reverse_Integer_7();
        int result = solution.reverse(123);
        System.out.println("Reversed number: " + result);
    }
}
