public class leetcode852 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0}; // Example input
        Solution solution = new Solution();
        int peakIndex = solution.peakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex);
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int e = arr.length - 1;
        int ans = -1;
        while (st <= e) {
            int m = st + (e - st) / 2;
            if (arr[m] < arr[m + 1]) {
                ans = m + 1;
                st = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}
