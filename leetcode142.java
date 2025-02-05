class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode hare = head;
        ListNode turtle = head;
        
        // Detect cycle
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                // Cycle detected, find the start of the cycle
                ListNode pointer1 = head;
                ListNode pointer2 = turtle;
                while (pointer1 != pointer2) {
                    pointer1 = pointer1.next;
                    pointer2 = pointer2.next;
                }
                return pointer1; // Starting node of the cycle
            }
        }
        
        return null; // No cycle
    }

    public static void main(String[] args) {
        // Create a sample linked list with a cycle for testing
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle
        
        leetcode142 solution = new leetcode142();
        ListNode cycleNode = solution.detectCycle(node1);
        
        if (cycleNode != null) {
            System.out.println("Cycle detected at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
