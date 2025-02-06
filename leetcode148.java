import java.util.Arrays;

public class Leetcode148 {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to sort the linked list
    public static ListNode sortList(ListNode head) {
        // Step 1: Convert the linked list into an array
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] values = new int[size];
        current = head;
        int i = 0;
        while (current != null) {
            values[i++] = current.val;
            current = current.next;
        }

        // Step 2: Sort the array
        Arrays.sort(values);

        // Step 3: Rebuild the linked list from the sorted array
        ListNode dummy = new ListNode(0);
        ListNode newHead = dummy;
        for (int val : values) {
            newHead.next = new ListNode(val);
            newHead = newHead.next;
        }

        return dummy.next;
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
        int[] values1 = {4, 2, 1, 3};
        ListNode head1 = createLinkedList(values1);
        System.out.print("Original list: ");
        printLinkedList(head1);
        head1 = sortList(head1);
        System.out.print("Sorted list: ");
        printLinkedList(head1);
    }
}
