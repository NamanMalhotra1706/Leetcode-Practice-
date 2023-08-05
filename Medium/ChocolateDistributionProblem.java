import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem {
    
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
          Collections.sort(a);
        long min=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
          min=Math.min(a.get(m-1+i)-a.get(i),min);
        }
        return min;
    }
    public static void main(String[] args) {
        
    }
}
