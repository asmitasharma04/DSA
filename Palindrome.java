package recursion;
public class Palindrome {

    // Helper recursive function to get the reverse of a number
    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        rev = rev * 10 + num % 10;
        return reverse(num / 10, rev);
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        // Negative numbers are not palindromes
        if (num < 0) {
            return false;
        }
        return num == reverse(num, 0);
    }

    public static void main(String[] args) {
        int testNumber = 12321;
        if (isPalindrome(testNumber)) {
            System.out.println(testNumber + " is a palindrome.");
        } else {
            System.out.println(testNumber + " is not a palindrome.");
        }
    }
}

