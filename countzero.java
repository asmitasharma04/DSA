package recursion;

public class countzero {

    // Recursive function to count zeros with helper function
    public static int countZeros(int num, int count) {
        // Base case: if the number is 0
        if (num == 0) {
            return count;
        }
        // Check the last digit and increment count if it is zero
        if (num % 10 == 0) {
            return countZeros(num / 10, count + 1);
        } else {
            return countZeros(num / 10, count);
        }
    }

    public static void main(String[] args) {
        int testNumber = 102030;
        int zeroCount = countZeros(testNumber, 0); // Initial count is 0
        System.out.println("The number of zeroes in " + testNumber + " is " + zeroCount);
    }
}

