class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        // If strings are already equal, return true
        if (s1.equals(s2)) return true;

        // Lists to store mismatched character indices
        int first = -1, second = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) return false; // More than 2 mismatches → cannot be fixed by one swap
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
        }

        // If there are exactly 2 mismatches, check if swapping them fixes the string
        return count == 2 &&
               s1.charAt(first) == s2.charAt(second) &&
               s1.charAt(second) == s2.charAt(first);
    }
}

