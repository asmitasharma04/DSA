public class Leetcode344 {

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Leetcode344 solution = new Leetcode344();

        // Example 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println(s1);  // Output: [o, l, l, e, h]

        // Example 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println(s2);  // Output: [h, a, n, n, a, H]
    }
}
