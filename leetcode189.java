import java.util.Arrays;
import java.util.Scanner;

class leetcode189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k is greater than the length of the array

        int[] newarr = new int[n];
        int count = 0;

        for (int i = n - k; i < n; i++) {
            newarr[count++] = nums[i];
        }
        for (int i = 0; i < n - k; i++) {
            newarr[count++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = newarr[i];
        }

        System.out.println("Array after rotation: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements separated by space:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of rotations:");
        int k = scanner.nextInt();

        leetcode189 solution = new leetcode189();
        solution.rotate(nums, k);
    }
}
