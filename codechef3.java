import java.util.Scanner;

public class codechef3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
            int sum = 0;
            int discountedSum = 0;

            for (int i = 0; i < a.length; i++) {
                sum += a[i];
                int discountedPrice = a[i] - y < 0 ? 0 : a[i] - y;
                discountedSum += discountedPrice;
            }

            x += discountedSum;

            if (x > sum) { // Corrected comparison
                System.out.println("COUPON");
            } else {
                System.out.println("NO COUPON");
            }
        }
    }
}

