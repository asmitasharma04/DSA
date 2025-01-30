public class Leetcode34 {
    public static void main(String[] args) {
        // Test cases to validate the solution
        Leetcode34 solution = new Leetcode34();
        
        // Test case 1
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = solution.searchRange(nums1, target1);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");  // Expected output: [3, 4]
        
        // Test case 2
        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = solution.searchRange(nums2, target2);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");  // Expected output: [-1, -1]
        
        // Test case 3
        int[] nums3 = {};
        int target3 = 0;
        int[] result3 = solution.searchRange(nums3, target3);
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");  // Expected output: [-1, -1]
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        
        // Initialize the result array to [-1, -1]
        result[0] = result[1] = -1;
        
        // First loop to find the first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // If we haven't found the first occurrence yet, set it
                if (result[0] == -1) {
                    result[0] = i;
                }
            }
        }
        
        // Second loop to find the last occurrence (loop from n-1 to 0)
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                // Set the last occurrence
                result[1] = i;
                break;  // Exit once the last occurrence is found
            }
        }
        
        return result;
    }
}
