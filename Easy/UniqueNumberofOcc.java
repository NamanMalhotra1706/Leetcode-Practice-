import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberofOcc {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
      HashSet<Integer> set=new HashSet<>();
      
    for(Map.Entry<Integer,Integer> entry: map.entrySet()){
        
            if(set.contains(entry.getValue())){
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }
}
