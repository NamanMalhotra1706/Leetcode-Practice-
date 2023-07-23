public class Sort012List {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node segregate(Node head) {
        Node zero = new Node(0);
        Node cz = zero;
        Node one = new Node(0);
        Node co = one;
        Node two = new Node(0);
        Node ct = two;
        while (head != null) {
            if (head.data == 0) {
                Node nn = new Node(head.data);
                cz.next = nn;
                cz = cz.next;

            } else if (head.data == 1) {
                Node nn = new Node(head.data);
                co.next = nn;
                co = co.next;

            } else {
                Node nn = new Node(head.data);
                ct.next = nn;
                ct = ct.next;

            }
            head = head.next;
        }
        co.next = two.next;
        cz.next = one.next;
        return zero.next;
    }

    public static void main(String[] args) {

    }
}