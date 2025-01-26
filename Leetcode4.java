import java.util.Arrays;

class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        System.arraycopy(nums1, 0, merged, 0, n1);
        System.arraycopy(nums2, 0, merged, n1, n2);

        Arrays.sort(merged);

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[(n / 2) - 1] + merged[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        leetcode4 solution = new leetcode4();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("The median is: " + median);
    }
}
