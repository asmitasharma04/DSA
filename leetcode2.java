// Filename: Leetcode2.java
class Leetcode2 {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; this.next = null; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null; // Head and tail for the new list
        int carry = 0; // Carry initialization

        // Traverse both lists
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // Get l1 value
            int y = (l2 != null) ? l2.val : 0; // Get l2 value
            int sum = x + y + carry;           // Compute sum

            carry = sum / 10;                  // Update carry
            ListNode newNode = new ListNode(sum % 10); // Create a new node

            // If head is null, initialize head
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode; // Append new node to tail
                tail = tail.next;    // Move tail forward
            }

            // Move l1 and l2 forward
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's any carry left, create an additional node
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return head; // Return the head of the resulting list
    }

    // Utility function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // 
