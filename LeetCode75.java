public class LeetCode75 {
    public static void selectionSort(int[] arr) {
        // Traverse through all array elements
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update the index of the minimum element
                }
            }
            
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Call selectionSort
        selectionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
