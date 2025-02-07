class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class leetcode25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy, curr = head;
        
        while (true) {
            // Check if there are k nodes left to reverse
            ListNode kthNode = prevGroupEnd;
            for (int i = 0; i < k; i++) {
                kthNode = kthNode.next;
                if (kthNode == null) return dummy.next;
            }
            
            // Reverse k nodes
            ListNode prev = null, next = null;
            ListNode firstNode = prevGroupEnd.next;
            curr = firstNode;
            int num = 0;
            while (num < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                num++;
            }
            
            // Connect reversed part with remaining list
            prevGroupEnd.next = prev;
            firstNode.next = curr;
            prevGroupEnd = firstNode;
        }
    }
    
    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int k = 2;
        System.out.print("Original List: ");
        printList(head);
        
        head = reverseKGroup(head, k);
        System.out.print("Reversed in k-groups: ");
        printList(head);
    }
}