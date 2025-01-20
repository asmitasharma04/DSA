// package recursion;
// import java.util.ArrayList;
// public class arraylist {
   

//     public static void main(String[] args) {
//         int []arr = {1, 2, 3, 4, 4, 4, 5, 6};
//         int target = 4;
//         ArrayList<Integer> indices = findAllIndices(arr, target, 0, new ArrayList<Integer>());
//         System.out.println(indices);
//     }

//     static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list) {
//         if (index == arr.length) {
//             return list;
//         }
//         if (arr[index] == target) {
//             list.add(index);
//         }
//         return findAllIndices(arr, target, index + 1, list);
//     }


// }
package recursion;
import java.util.ArrayList;

public class FindAllIndices {
    static ArrayList<Integer> list = new ArrayList<>(); // List to store indices

    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 4, 4, 5, 6};
        int target = 4;
        findAllIndices(arr, target, 0);
        System.out.println(list);
    }

    static void findAllIndices(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndices(arr, target, index + 1);
    }
}
