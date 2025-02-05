import java.util.Scanner;

public class codechef5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            // Your code goes here
              int happyDays = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] <= 2 * b[i] && b[i] <= 2 * a[i]) {
                    happyDays++;
                }
            }

            System.out.println(happyDays); // Output the number of happy days for this test case
        }

        scanner.close();
    }
}
