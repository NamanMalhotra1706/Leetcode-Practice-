public class flipBits {
    public static int maxOnes(int a[], int n) {
        int oneCnt = 0 ;
        int curr_Sum = 0 ;
        int maxSum = 0 ;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                oneCnt++;
                curr_Sum += -1; // Subtracting 1 from current sum if a[i] is 1
            } else {
                curr_Sum += 1; // Adding 1 to current sum if a[i] is 0 (flipping 0 to 1)
            }

            maxSum =Math.max(curr_Sum, maxSum);
            if (curr_Sum < 0) curr_Sum = 0;
        }

        return maxSum + oneCnt;
        
    }
}
