public class Leetcode35 {
    public static void main(String[] args) {
        // Test cases to validate the solution
        Leetcode35 solution = new Leetcode35();
        
        // Test case 1
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println(solution.searchInsert(nums1, target1)); // Output: 2
        
        // Test case 2
        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println(solution.searchInsert(nums2, target2)); // Output: 1
        
        // Test case 3
        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println(solution.searchInsert(nums3, target3)); // Output: 4
        
        // Test case 4 (edge case: empty array)
        int[] nums4 = {};
        int target4 = 1;
        System.out.println(solution.searchInsert(nums4, target4)); // Output: 0
    }

    // Function to find the index where target is found or should be inserted
    public int searchInsert(int[] nums, int target) {
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the target is found, return the index
            if (nums[i] == target) {
                return i;
            }
            // If the target is smaller than the current element, return the current index as insertion point
            if (nums[i] > target) {
                return i;
            }
        }
        
        // If we didn't find the target, it should be inserted at the end of the array
        return nums.length;
    }
}

