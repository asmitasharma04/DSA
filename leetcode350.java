public class leetcode350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length]; // Assume nums1 is longer or the same length as nums2
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[index++] = nums1[i];
                    nums2[j] = -1; // Mark the element to avoid reuse
                    break; // Move to the next element in nums1
                }
            }
        }

        // Return only the populated part of the result array
        return java.util.Arrays.copyOf(result, index);
    }

    public static void main(String[] args) {
        leetcode350 sol = new leetcode350();
        int[] nums1 = {0, 1, 2, 0};
        int[] nums2 = {0, 0, 2};
        int[] result = sol.intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " "); // Output: 0 2 0
        }
    }
}
 
    

