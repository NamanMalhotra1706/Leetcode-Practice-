public class nthFibonacii {
    static int nthFibonacci(int n){
     
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i=2;i<=n;i++){
            
            dp[i] = dp[i-1]%1000000007 + dp[i-2]%1000000007;
        }
        return dp[n]%1000000007;
       }
}
