/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return the head for empty or single node list
        }

        ListNode prevnode = head;
        ListNode currnode = head.next;
        
        while (currnode != null) {
            ListNode nextnode = currnode.next; // Save the next node
            currnode.next = prevnode; // Reverse the link
            prevnode = currnode; // Move prevnode to current node
            currnode = nextnode; // Move currnode to next node
        }

        head.next = null; // Set the next of the original head to null
        head = prevnode; // Update the head to the new head (prevnode)

        return head; // prevnode is the new head of the reversed list
    }
}

public class leetcode206 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution(); // Create an instance of Solution
        ListNode reversedHead = solution.reverseList(head); // Reverse the linked list

        // Print the reversed linked list
        ListNode current = reversedHead;
        System.out.print("Reversed list: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}

