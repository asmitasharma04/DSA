import java.util.*;

public class leetcode2349 {

    private Map<Integer, Integer> indexToNumber;
    private Map<Integer, TreeSet<Integer>> numberToIndices;

    public leetcode2349() {
        indexToNumber = new HashMap<>();
        numberToIndices = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexToNumber.containsKey(index)) {
            int oldNumber = indexToNumber.get(index);
            TreeSet<Integer> indices = numberToIndices.get(oldNumber);
            indices.remove(index);
            if (indices.isEmpty()) {
                numberToIndices.remove(oldNumber);
            }
        }

        indexToNumber.put(index, number);
        numberToIndices.putIfAbsent(number, new TreeSet<>());
        numberToIndices.get(number).add(index);
    }

    public int find(int number) {
        if (numberToIndices.containsKey(number) && !numberToIndices.get(number).isEmpty()) {
            return numberToIndices.get(number).first();
        }
        return -1;
    }

    public static void main(String[] args) {
        leetcode2349 nc = new leetcode2349();
        System.out.println(nc.find(10)); // Output: -1
        nc.change(2, 10);
        nc.change(1, 10);
        nc.change(3, 10);
        nc.change(5, 10);
        System.out.println(nc.find(10)); // Output: 1
        nc.change(1, 20);
        System.out.println(nc.find(10)); // Output: 2
    }
}
