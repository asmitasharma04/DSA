public class leetcode141 {
    public static void main(String[] args) {
        // Create a test case for the hasCycle method
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Creating a cycle for testing
        node4.next = node2;

        leetcode141 solution = new leetcode141();
        boolean result = solution.hasCycle(node1);
        System.out.println("Does the linked list have a cycle? " + result);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode hare = head;
        ListNode turtle = head;
        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
            if (hare == turtle) {
                return true;
            }
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
