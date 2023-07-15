import java.util.*;

class EventAttended {
    int[][] events;
    public int maxValue(int[][] events, int k) {
        this.events = events;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;
        
        arr = new int[k + 1][n];
        for (int[] row : arr) {
            Arrays.fill(row, -1);
        }
        
        return dfs(0, k);
    }    
    
    private int[][] arr;
    private int dfs(int index, int count) {
        
        if (count == 0 || index == events.length) {
            return 0;
        }
        if (arr[count][index] != -1) {
            return arr[count][index];
        }
        int nextIndex = binarySearch(events[index][1]);
        arr[count][index] = Math.max( events[index][2] + dfs(nextIndex, count - 1), dfs(index + 1, count));
        return arr[count][index];
    }
    
    public int binarySearch( int target) {
        int left = 0, right = events.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (events[mid][0] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }   
}