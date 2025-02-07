import java.util.Scanner;

public class codechef7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of problems solved
            int[] d = new int[n]; // Array to store difficulty ratings
            
            for (int i = 0; i < n; i++) {
                d[i] = scanner.nextInt(); // Reading difficulty ratings
            }
            
            if (isNonDecreasing(d)) {
                System.out.println("Yes"); // Print "Yes" if the order is non-decreasing
            } else {
                System.out.println("No"); // Print "No" if the order is not non-decreasing
            }
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
    
    // Function to check if the array is in non-decreasing order
    private static boolean isNonDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

