import java.util.*;
import java.lang.*;
import java.io.*;

class codechefmaximum
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Create a scanner object to read inputs
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the number of mountains for this test case
            int N = sc.nextInt();
            
            // Create an array to store the mountain heights
            int[] heights = new int[N];
            
            // Read the heights of the mountains
            for (int i = 0; i < N; i++) {
                heights[i] = sc.nextInt();
            }
            
            // Find and print the maximum height of the mountains
            int maxHeight = findMaxHeight(heights);
            System.out.println(maxHeight);
        }
        
        // Close the scanner
        sc.close();
    }
    
    // Function to find the maximum height from the array of heights
    public static int findMaxHeight(int[] heights) {
        int max = heights[0]; // Start with the first height as the maximum
        
        // Traverse through the array to find the maximum
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        
        return max; // Return the maximum height
    }
}
