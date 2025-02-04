import java.util.Scanner;

public class codechef4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println(minOperations(a, n));
        }
        scanner.close();
    }

    public static int minOperations(int[] a, int n) {
        int M = a[0]; // Initialize M with the first element
        for (int i = 1; i < n; i++) {
            if (a[i] < M) {
                M = a[i]; // Find the minimum value M
            }
        }

        int operations = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > M) {
                operations++; // Count elements greater than M
            }
        }

        return operations;
    }
}
