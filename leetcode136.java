import java.util.*;
class leetcode136 {
    public int singleNumber(int[] nums) {
        int result = 0;  // Initialize result to 0
        for (int num : nums) {
            result ^= num;  // XOR each number with result
        }
        return result;  // The result will be the single number
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

        leetcode136 solution = new leetcode136();
        int singleNumber = solution.singleNumber(nums);

        System.out.println("The single number is: " + singleNumber);
    }
}

