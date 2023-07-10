// 6913. Longest Alternating Subarray

class alternateSubarray {

    public int alternatingSubarray(int[] nums) {
        int maxLength = -1;
        for (int i = 0; i < nums.length; i++) {
            int cnt = 1;
            int flg = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (flg == 0 && nums[j] == nums[i] + 1) {
                    cnt++;
                    flg = 1;
                } else if (flg == 1 && nums[i] == nums[j]) {
                    cnt++;
                    flg = 0;
                } else
                    break;
            }

            if (cnt > 1)
                maxLength = Math.max(maxLength, cnt);

        }

        return maxLength;
    }
}