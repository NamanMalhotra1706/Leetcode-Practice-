import java.util.*;

class MinimumSizeSubarraySum {

    // Leetcode Solution
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int answer = Integer.MAX_VALUE;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                sum = sum -nums[left];
                answer = Math.min(right-left+1,answer);
                left++;
            }
            right++;
        }
        if(answer==Integer.MAX_VALUE){
            return 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};

        // int target = 11;
        // int [] nums={1,1,1,1,1,1,1,1};

        int minLength = minSubArrayLen(target,nums);

        System.out.println(minLength);
    }
}
