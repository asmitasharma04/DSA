import java.util.*;

class leetcode1726 {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        int n = nums.length;
        int count = 0;

        // Step 1: Compute product pairs and store counts in HashMap
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }

        // Step 2: Compute valid tuples
        for (int freq : productCount.values()) {
            if (freq > 1) {
                count += freq * (freq - 1) * 4; // Each valid (a,b), (c,d) pair has 8 permutations
            }
        }

        return count;
    }

    public static void main(String[] args) {
       leetcode1726 sol = new leetcode1726();
        System.out.println(sol.tupleSameProduct(new int[]{2, 3, 4, 6}));  // Output: 8
        System.out.println(sol.tupleSameProduct(new int[]{1, 2, 4, 5, 10})); // Output: 16
    }
}

