public class LongestIncSubSeq {

    public int findNumberOfLIS(int[] nums) {
    int n = nums.length;
        int[] lis = new int[n];
        int[] freq = new int[n];
        lis[0] = 1;
        freq[0] = 1;
        int lo = 1;

        for (int i = 1; i < nums.length; i++) {
            int mx = 0;
            int c = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (lis[j] > mx) {
                        mx = lis[j];
                        c = freq[j];
                    } else if (lis[j] == mx) {
                        c += freq[j];
                    }
                }
            }
            freq[i] = c;
            lis[i] = mx + 1;
            if (lo < lis[i]) {
                lo = lis[i];
            }
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (lis[i] == lo) {
                count += freq[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
