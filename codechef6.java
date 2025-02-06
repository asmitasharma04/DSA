import java.util.*;

public class codechef6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            // Your code goes here
             Arrays.sort(a);
            
            // Find the two largest distinct integers
            int firstMax = a[n - 1];
            int secondMax = -1;
            
            // Find the second largest distinct element
            for (int i = n- 2; i >= 0; i--) {
                if (a[i] != firstMax) {
                    secondMax = a[i];
                    break;
                }
            }
            
            // Print the result (sum of largest two distinct integers)
            System.out.println(firstMax + secondMax);
        }
        
        
    }
}
