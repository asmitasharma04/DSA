// Filename: leetcode430.java
class leetcode430 {

    // Definition for a Node.
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
            this.child = null;
        }
    }

    static class leetcode430 {
        public Node flatten(Node head) {
            Node temp = head;
            while (temp != null) {
                Node t = temp.next;
                if (temp.child != null) {
                    Node c = flatten(temp.child);
                    temp.next = c;
                    c.prev = temp;
                    // Move c to the end
                    while (c.next != null) {
                        c = c.next;
                    }
                    c.next = t;
                    if (t != null) t.prev = c;
                }
                temp.child = null; // Very important!
                temp = t;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        // Example usage of the flatten function
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.child = new Node(4);
        head.next.child.next = new Node(5);
        head.next.child.next.prev = head.next.child;

        leetcode430 solution = new leetcode430();
        head = solution.flatten(head);

        // Print the flattened list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
