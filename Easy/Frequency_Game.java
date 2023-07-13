import java.util.*;

public class Frequency_Game {

    public static int LargButMinFreq(int arr[], int n) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
               
        int maxEle=Integer.MIN_VALUE;
        int min_freq = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet()){

            if(e.getValue()<=min_freq){
                min_freq=e.getValue();
                if(e.getKey()>maxEle){
                    maxEle=e.getKey();
                }
            }
        }        
        return maxEle;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,50,5};
        int n = 5;

        System.out.println(LargButMinFreq(arr,n));
    }
}
