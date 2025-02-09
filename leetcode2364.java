import java.util.HashMap;
import java.util.Map;

public class leetcode2364 {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = n * (n - 1) / 2;
        long goodPairs = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = i - nums[i];
            goodPairs += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return totalPairs - goodPairs;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {4, 1, 3, 3};
        System.out.println(solution.countBadPairs(nums1)); // Output: 5

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(solution.countBadPairs(nums2)); // Output: 0

        int[] nums3 = {84583, 49206, 48364, 56885, 60343, 11608, 43763, 66394, 52205, 45261, 45908, 4885, 22146, 53622, 4605, 42969, 91237, 2938, 51929, 29520, 36927, 24950, 35466, 43289, 56661, 29770, 10845, 49708, 71137, 54086, 50532, 37880, 51732, 6409, 54223, 43114, 98062, 4098, 78619, 78984, 3074, 74001, 95713, 4481, 81643, 82766, 720, 79066, 96838, 84720, 2341, 22468, 94006, 34020, 94314, 12719, 43111, 23730, 36124, 96051, 19361, 49664, 8730, 32479, 28383, 38440, 13655, 66342, 26476, 68172, 13427, 98738, 72574, 97864, 91488, 37556, 80355, 39422, 3463, 33335, 28502, 28768, 10693, 96307, 36176, 81341, 99070, 83988, 3188, 42623};
        System.out.println(solution.countBadPairs(nums3)); // Expected output: 2800978228
    }
}
