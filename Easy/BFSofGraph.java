import java.util.*;

class BFSofGraph{
    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       ArrayList<Integer>  al =  new ArrayList<>();
        Queue<Integer>  q =  new LinkedList<>();
        boolean vis[] = new boolean[V];
        
        q.add(0);  // adding the first node
        
        vis[0] =  true;  // mark it visited.
        
        while(!q.isEmpty())
        {
            int curr = q.poll();  // dequeueing and adding into al
            al.add(curr);
            
            for( int neighbour : adj.get(curr) ) 
            if(!vis[neighbour])
            {
                vis[neighbour]  =  true;
                q.add(neighbour);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        
    }
}