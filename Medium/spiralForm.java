import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class spiralForm {
    class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
    ArrayList<Integer> findSpiral(Node root) 
    {
          Queue<Node> q= new LinkedList<>();
        
        q.add(root);ArrayList<Integer> temp= new ArrayList<>();
        ArrayList<Integer> spiral= new ArrayList<>();
        int c=0;
        while (true) {
 
         
            int nodeCount = q.size();
            if (nodeCount == 0)
                break;
         
           
            while (nodeCount > 0) {
                Node node = q.peek();
                
                temp.add(node.data);
               
                q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            if(c%2==0){
                Collections.reverse(temp);
            }
            
            spiral.addAll(temp);
            c++;
            temp.clear();
            
        
    }
        return spiral;
    }
}
