// leetcode523.java

class leetcode523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k && (j - i + 1) >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        leetcode523 solution = new leetcode523();
        
        // Test case
        int[] nums = {1, 2, 3, 4, 5};
        int k = 12;
        boolean result = solution.checkSubarraySum(nums, k);

        // Output the result
        System.out.println("Is there a subarray with sum equals " + k + ": " + result);
    }
}

