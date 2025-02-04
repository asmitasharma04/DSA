// Filename: leetcode237.java

// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class leetcode237 {
    public static void deleteNode(ListNode node) {
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        
        // Bypass the next node
        node.next = node.next.next;
    }
    
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        
        // Let's say we want to delete the node with value 5
        ListNode nodeToDelete = head.next; // node with value 5
        
        deleteNode(nodeToDelete);
        
        // Print the modified linked list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
