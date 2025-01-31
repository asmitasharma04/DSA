public class leetcode162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1}; // Example input
        Solution solution = new Solution();
        int peakIndex = solution.findPeakElement(nums);
        System.out.println("Peak Index: " + peakIndex);
    }
}

class Solution {
    public int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if ((m == 0 || nums[m] > nums[m - 1]) && (m == e || nums[m] > nums[m + 1])) {
                return m;
            }
            if (nums[m] < nums[m + 1]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
