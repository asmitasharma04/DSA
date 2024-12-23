import java.util.Scanner;

class leetcode283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (count < n) {
            nums[count++] = 0;
        }
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

        leetcode283 solution = new leetcode283();
        solution.moveZeroes(nums);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
 
    

