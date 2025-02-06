public class Leetcode2095 {
    
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static ListNode deleteMiddle(ListNode head) {
        // Special case: If there's only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move slow by 1 step and fast by 2 steps until fast reaches the end
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        // Now, 'slow' is at the middle node, and 'prev' is the node before it
        prev.next = slow.next;

        return head;
    }

    // Helper method to create a linked list from an array of values
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Test case 1
        int[] values1 = {1, 3, 4, 7, 1, 2, 6};
        ListNode head1 = createLinkedList(values1);
        System.out.print("Original list: ");
        printLinkedList(head1);
        head1 = deleteMiddle(head1);
        System.out.print("Modified list: ");
        printLinkedList(head1);
        
        // Test case 2
        int[] values2 = {1, 2, 3, 4};
        ListNode head2 = createLinkedList(values2);
        System.out.print("Original list: ");
        printLinkedList(head2);
        head2 = deleteMiddle(head2);
        System.out.print("Modified list: ");
        printLinkedList(head2);

        // Test case 3
        int[] values3 = {2, 1};
        ListNode head3 = createLinkedList(values3);
        System.out.print("Original list: ");
        printLinkedList(head3);
        head3 = deleteMiddle(head3);
        System.out.print("Modified list: ");
        printLinkedList(head3);
    }
}
