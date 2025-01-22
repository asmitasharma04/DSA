// leetcode560.java

class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0; 
        for (int start = 0; start < nums.length; start++) {
            int sum = 0; 
            for (int end = start; end < nums.length; end++) {
                sum += nums[end]; 
                if (sum == k) {
                    count++; 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode560 solution = new leetcode560();
        
        // Test case
        int[] nums = {1, 2, 1, 2, 1};
        int k = 3;
        int result = solution.subarraySum(nums, k);

        // Output the result
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}
