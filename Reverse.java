package recursion;

public class Reverse {
    public static void main(String[] args) {
        int number = 1234;
        int reversedNumber = reverseNumber(number, 0);
        System.out.println("Reversed Number: " + reversedNumber);  // Output will be 4321
    }

    public static int reverseNumber(int n, int sum) {
        if (n == 0) {
            return sum;
        } else {
            sum = sum * 10 + n % 10;
            return reverseNumber(n / 10, sum);
        }
    }
}

