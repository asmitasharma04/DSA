public class leetcode1800 {
    public static void main(String[] args) {
        // Test the maxAscendingSum method
        leetcode1800 solution = new leetcode1800();
        int[] nums = {10, 20, 30, 5, 10, 50}; // Example array
        int result = solution.maxAscendingSum(nums);
        System.out.println("Maximum Ascending Subarray Sum: " + result);
    }

    public int maxAscendingSum(int[] nums) {
        int maxSum = 0;
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
            } else {
                maxSum = Math.max(maxSum, currentSum);
                currentSum = nums[i];
            }
        }
        // Check for the last subarray
        maxSum = Math.max(maxSum, currentSum);

        return maxSum;
    }
}
