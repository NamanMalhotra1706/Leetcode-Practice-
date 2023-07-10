import java.util.Arrays;

public class putMarblesInbag {

    public long putMarbles(int[] weights, int k) {
         if(k==1 || k==weights.length)
        {
            return 0;
        }
        int[] score = new int[weights.length - 1];
        for(int i=0;i<weights.length-1;i++)
        {
            score[i] = weights[i] + weights[i+1];
        }
        Arrays.sort(score);
        long min_sum = 0,max_sum=0;
        for(int i=0;i<k-1;i++)
        {
            min_sum += score[i];
            max_sum += score[score.length - i -1];
        }
        return (max_sum - min_sum);
    }
    }
