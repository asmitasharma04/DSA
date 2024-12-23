import java.util.Scanner;

class leetcode26 {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[x] = nums[i];
                x++;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the sorted elements separated by space:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        leetcode26 solution = new leetcode26();
        int newLength = solution.removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
 
    

