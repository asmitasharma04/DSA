// Filename: Leetcode328.java

class Solution {
    // Function to group odd and even indexed nodes
    public ListNode oddEvenList(ListNode head) {
        // Edge case: if the list is empty or contains only one node
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize the odd and even lists
        ListNode odd = head; // Head of the odd-indexed list
        ListNode even = head.next; // Head of the even-indexed list
        ListNode evenHead = even; // To remember the start of the even list
        
        // Traverse the list and separate the odd and even indexed nodes
        while (even != null && even.next != null) {
            odd.next = odd.next.next; // Link the odd-indexed node to the next odd-indexed node
            even.next = even.next.next; // Link the even-indexed node to the next even-indexed node
            odd = odd.next; // Move the odd pointer to the next odd-indexed node
            even = even.next; // Move the even pointer to the next even-indexed node
        }
        
        // Attach the even list to the end of the odd list
        odd.next = evenHead;
        
        // Return the reordered list
        return head;
    }

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Main method (psvm)
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Input: [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.oddEvenList(head1);
        printList(result1);  // Output: [1, 3, 5, 2, 4]

        // Test case 2: Input: [2,1,3,5,6,4,7]
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(5);
        head2.next.next.next.next = new ListNode(6);
        head2.next.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next.next = new ListNode(7);

        ListNode result2 = solution.oddEvenList(head2);
        printList(result2);  // Output: [2, 3, 6, 7, 1, 5, 4]
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

