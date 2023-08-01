import java.util.ArrayList;

public class DFSofGraph {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V+1];
         ArrayList<Integer> ans = new ArrayList<>();
         depthSearch(ans,adj,vis,0);
         return ans;
     }
 
     private void depthSearch(ArrayList<Integer> ans, ArrayList<ArrayList<Integer>> adj, boolean[] vis, int i) {
         ans.add(i);
         vis[i] = true;
         for(int it: adj.get(i)){
             if(!vis[it]){
                 depthSearch(ans,adj,vis,it);
             }
         }
     }
     public static void main(String[] args) {
        
     }
}
