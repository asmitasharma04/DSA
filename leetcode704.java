public class leetcode704 {
    public static void main(String[] args) {
        leetcode704 sol = new leetcode704();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = sol.search(nums, target);
        System.out.println("Index of target: " + result);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;
        while (st <= end) {
            int m = st + (end - st) / 2;
            if (target == nums[m]) {
                return m;
            } else if (target < nums[m]) {
                end = m - 1;
            } else {
                st = m + 1;
            }
        }
        return -1;
    }
}

