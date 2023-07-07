public class RemoveNthNodeFromLast {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        int count = 0;
        ListNode currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }

        ListNode prevNode = head;
        int indexTobeDeleted = count - n;
        int i = 1;
        while (i < indexTobeDeleted) {
            prevNode = prevNode.next;
            i++;
        }
        if (n == count) {
            return head.next;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public static void main(String[] args) {

    }
}
