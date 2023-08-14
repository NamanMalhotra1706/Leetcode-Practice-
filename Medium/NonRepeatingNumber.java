import java.util.Arrays;
import java.util.HashSet;

public class NonRepeatingNumber {

    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i]))
                set.add(nums[i]);
            else
                set.remove(nums[i]);
        }
        int[] ans = new int[2];
        int i = 0;

        for (int a : set)
            ans[i++] = a;

        Arrays.sort(ans);

        return ans;
    }
}
