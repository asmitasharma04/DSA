public class LeetCode238 {

    public static void main(String[] args) {
        // Example test case 1
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = productExceptSelf(nums1);
        System.out.print("Output 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example test case 2
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = productExceptSelf(nums2);
        System.out.print("Output 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Step 1: Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = prefix;
            prefix *= nums[i];
        }
        
        // Step 2: Calculate suffix products and update the answer array
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        
        return answer;
    }
}
