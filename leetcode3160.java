import java.util.HashMap;
import java.util.Map;

public class leetcode3160 {
    public static int[] countDistinctColors(int limit, int[][] queries) {
        Map<Integer, Integer> ballColors = new HashMap<>();
        Map<Integer, Integer> colorCount = new HashMap<>();
        int[] result = new int[queries.length];
        int distinctColorCount = 0;

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];

            // If ball x already has a color, decrement the count of that color
            if (ballColors.containsKey(x)) {
                int currentColor = ballColors.get(x);
                colorCount.put(currentColor, colorCount.get(currentColor) - 1);
                if (colorCount.get(currentColor) == 0) {
                    distinctColorCount--;
                }
            }

            // Update the color of ball x
            ballColors.put(x, y);

            // Increment the count of the new color
            colorCount.put(y, colorCount.getOrDefault(y, 0) + 1);
            if (colorCount.get(y) == 1) {
                distinctColorCount++;
            }

            // Store the number of distinct colors in the result array
            result[i] = distinctColorCount;
        }

        return result;
    }

    public static void main(String[] args) {
        int limit = 4;
        int[][] queries1 = {{1, 4}, {2, 5}, {1, 3}, {3, 4}};
        int[] result1 = countDistinctColors(limit, queries1);
        for (int r : result1) {
            System.out.print(r + " ");  // Output: 1 2 2 3
        }
        System.out.println();

        int[][] queries2 = {{0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}};
        int[] result2 = countDistinctColors(limit, queries2);
        for (int r : result2) {
            System.out.print(r + " ");  // Output: 1 2 2 3 4
        }
    }
}
