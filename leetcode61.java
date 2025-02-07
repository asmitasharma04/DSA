class Solution {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; this.next = null; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length of the list
        int length = 1; // Start from 1 since we're counting nodes
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Optimize k (avoid unnecessary rotations)
        k = k % length;
        if (k == 0) return head; // No need to rotate if k is multiple of length

        // Step 3: Find the new tail (at position length - k - 1)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        // Step 4: Set new head and break the link
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head; // Connect the old tail to the old head

        return newHead;
    }

    // Utility function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main function to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.print("Original List: ");
        printList(head);

        // Rotate by k = 2
        ListNode result = sol.rotateRight(head, 2);

        // Print rotated list
        System.out.print("Rotated List: ");
        printList(result);
    }
}

