 class leetcode1752 {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        leetcode1752 sol = new leetcode1752();

        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.println("Array {3, 4, 5, 1, 2}: " + sol.check(nums1)); // Output: true

        int[] nums2 = {2, 1, 3, 4};
        System.out.println("Array {2, 1, 3, 4}: " + sol.check(nums2)); // Output: false

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Array {1, 2, 3, 4, 5}: " + sol.check(nums3)); // Output: true
    }
}
 
    

