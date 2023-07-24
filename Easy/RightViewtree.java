import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class RightViewtree {

    class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}

    ArrayList<Integer> rightView(Node node) {
       Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(node);
        q.add(null);
        // list.add(node.data);
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            // System.out.println("hello");
            if(q.peek() == null)
            {
                if(curr!=null)
                list.add(curr.data);
            }
            if(curr == null)
            {
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else{
                if(curr.left!=null)
                    q.add(curr.left);
                 if(curr.right!=null)
                    q.add(curr.right);
                }
        }
        return list;
    }
}

