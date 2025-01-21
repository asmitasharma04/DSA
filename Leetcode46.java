import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {

    // Function to generate all permutations
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);  // Start backtracking from index 0
        return result;
    }

    // Helper function for backtracking
    private void backtrack(int[] nums, int start, List<List<Integer>> result) {
        // If we have processed all elements (a valid permutation), add it to the result
        if (start == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);  // Copy the current arrangement into the result list
            }
            result.add(currentPermutation);  // Add the permutation to the result
            return;
        }

        // Try each possible element at the current position (start)
        for (int i = start; i < nums.length; i++) {
            // Swap the element at 'start' with the element at index 'i'
            swap(nums, start, i);
            // Recurse to the next position
            backtrack(nums, start + 1, result);
            // Backtrack: Undo the swap to restore the array to its previous state
            swap(nums, start, i);
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Leetcode46 solution = new Leetcode46();

        // Test case 1
        int[] nums1 = {1, 2, 3};
        System.out.println(solution.permute(nums1));  // Expected: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]

        // Test case 2
        int[] nums2 = {0, 1};
        System.out.println(solution.permute(nums2));  // Expected: [[0, 1], [1, 0]]

        // Test case 3
        int[] nums3 = {1};
        System.out.println(solution.permute(nums3));  // Expected: [[1]]
    }
}

