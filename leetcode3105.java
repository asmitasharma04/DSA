public class leetcode3105 {
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 3, 3, 2};
        int[] nums2 = {3, 3, 3, 3};
        int[] nums3 = {3, 2, 1};

        System.out.println("Example 1 Output: " + findLongestSubarray(nums1));
        System.out.println("Example 2 Output: " + findLongestSubarray(nums2));
        System.out.println("Example 3 Output: " + findLongestSubarray(nums3));
    }

    public static int findLongestSubarray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int lengthIncreasing = 1;
        int lengthDecreasing = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                lengthIncreasing++;
                lengthDecreasing = 1;
            } else if (nums[i] < nums[i - 1]) {
                lengthDecreasing++;
                lengthIncreasing = 1;
            } else {
                lengthIncreasing = 1;
                lengthDecreasing = 1;
            }
            maxLength = Math.max(maxLength, Math.max(lengthIncreasing, lengthDecreasing));
        }

        return maxLength;
    }
}

