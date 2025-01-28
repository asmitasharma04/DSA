public class Leetcode443 {

    // Main method to test the compression function
    public static void main(String[] args) {
        // Test case 1
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength1 = compress(chars1);
        System.out.println("Compressed string: " + new String(chars1, 0, newLength1));

        // Test case 2
        char[] chars2 = {'a'};
        int newLength2 = compress(chars2);
        System.out.println("Compressed string: " + new String(chars2, 0, newLength2));

        // Test case 3
        char[] chars3 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int newLength3 = compress(chars3);
        System.out.println("Compressed string: " + new String(chars3, 0, newLength3));
    }

    // Method to compress the array
    public static int compress(char[] chars) {
        int index = 0; // Pointer to write the compressed string back to the array
        int i = 0; // Pointer to traverse the array

        for (i = 0; i < chars.length;) {  // Notice there's no 'i++' here
            char ch = chars[i];  // Current character
            int count = 0;  // Count consecutive occurrences

            // Count how many times the current character repeats
            while (i < chars.length && chars[i] == ch) {
                count++;  // Increase the count for each repetition of 'ch'
                i++;  // Increment i inside the while loop
            }

            // Write the current character to the array
            chars[index++] = ch;

            // If count > 1, we append the count (as a string)
            if (count > 1) {
                String countStr = Integer.toString(count);  // Convert count to string
                for (char digit : countStr.toCharArray()) {
                    chars[index++] = digit;  // Write each digit of the count
                }
            }
            // If count == 1, we do nothing extra. The character is already written.
        }

        // Return the new length of the compressed string
        return index;
    }
}
