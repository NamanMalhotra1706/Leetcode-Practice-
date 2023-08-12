import java.util.Arrays;

class AgressiveCow{
     public static boolean isPossible(int mid,int k,int arr[]){
    
        int count=1;
        
        
        int position=arr[0];
        
        for(int i=0;i<arr.length;i++){

            if(arr[i]-position >=mid){
                count++;
                position=arr[i];
            }
        if(count==k){
            return true;
        }
    }
            return false;
        }
    
    public static int solve(int n, int k, int[] stalls) {
        
    
    Arrays.sort(stalls);
    
        int end=stalls[stalls.length-1]-stalls[0];
        
        int start=1;
        
        int ans=0;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(isPossible(mid,k,stalls)==true){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
}