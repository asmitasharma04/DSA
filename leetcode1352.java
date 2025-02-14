import java.util.ArrayList;
import java.util.List;

public class leetcode1352 {
    private List<Integer> prefixProducts;

    public leetcode1352() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); // Initialize with 1 for multiplication identity
    }

    public void add(int num) {
        if (num == 0) {
            prefixProducts = new ArrayList<>();
            prefixProducts.add(1); // Reset the product list if the number is 0
        } else {
            prefixProducts.add(prefixProducts.get(prefixProducts.size() - 1) * num);
        }
    }

    public int getProduct(int k) {
        int n = prefixProducts.size();
        if (k >= n) {
            return 0; // If k is larger than the length of prefixProducts, there was a zero in the last k numbers
        }
        return prefixProducts.get(n - 1) / prefixProducts.get(n - 1 - k);
    }

    public static void main(String[] args) {
        leetcode1352 productOfNumbers = new leetcode1352();
        productOfNumbers.add(3);        
        productOfNumbers.add(0);        
        productOfNumbers.add(2);        
        productOfNumbers.add(5);        
        productOfNumbers.add(4);        
        System.out.println(productOfNumbers.getProduct(2)); // 20
        System.out.println(productOfNumbers.getProduct(3)); // 40
        System.out.println(productOfNumbers.getProduct(4)); // 0
        productOfNumbers.add(8);        
        System.out.println(productOfNumbers.getProduct(2)); // 32
    }
}
