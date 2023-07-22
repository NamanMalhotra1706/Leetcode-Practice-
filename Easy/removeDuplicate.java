import java.util.HashSet;



class removeDuplicate{

    class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
} 

     public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs = new HashSet<>();
        Node temp = head;
        Node prev = null;
        while(temp != null){
            int val = temp.data;
            if(hs.contains(val)){
                prev.next = temp.next;
            }
            else{
                hs.add(val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        
    }
}