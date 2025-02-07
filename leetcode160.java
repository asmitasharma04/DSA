// Java program to find the intersection of two linked lists
class Leetcode160 {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Function to get the intersection node
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) {  // Compare node references
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA;  // Either the intersection node or null
    }

    // Main method to test the function
    public static void main(String[] args) {
        // Creating two linked lists with intersection at node c1
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        common.next.next = new ListNode(12);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;  // Linking to common node

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);
        headB.next.next = common;  // Linking to common node

        // Finding the intersection node
        ListNode intersection = getIntersectionNode(headA, headB);

        // Printing the result
        if (intersection != null) {
            System.out.println("Intersection Node Value: " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}
