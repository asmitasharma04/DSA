public class Leetcode713 {

    public static void main(String[] args) {
        // Test the solution with an example
        Solution solution = new Solution();
        
        // Example input: nums = [10, 5, 2, 6], k = 100
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        
        // Call the method and print the result
        int result = solution.numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of subarrays: " + result);
    }
    
    static class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            int c = 0;  // To count the valid subarrays
            int prod = 1;  // Initialize product of the current window
            int i = 0;  // Left pointer of the window
            
            // Iterate through the array with the right pointer (j)
            for (int j = 0; j < nums.length; j++) {
                prod *= nums[j];  // Multiply the current number to the product
                
                // If product is greater than or equal to k, move the left pointer
                while (prod >= k && i <= j) {
                    prod /= nums[i];  // Shrink the window from the left
                    i++;  // Move the left pointer to the right
                }
                
                // The number of valid subarrays ending at index j is (j - i + 1)
                c += j - i + 1;
            }
            
            return c;
        }
    }
}
