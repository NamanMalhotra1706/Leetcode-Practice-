class Solution{
    static int knap(int N,int W,int val[],int wt[],int dp[]){
        if(W==0) return 0;
        if(dp[W]!=-1) return dp[W];
        int maxAns=0;
        for(int i=0;i<N;i++){
            if(wt[i]<=W) maxAns=Math.max(maxAns,val[i]+knap(N,W-wt[i],val,wt,dp));
        }
        return dp[W]=maxAns;
    }
    static int knapSack(int N, int W, int val[], int wt[])
    {
        // code here
        int dp[]=new int[W+1];
        Arrays.fill(dp,-1);
        return knap(N,W,val,wt,dp);
    }
}
