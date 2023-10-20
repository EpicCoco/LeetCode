class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        int globalMax = Integer.MIN_VALUE;
        int[] dp = new int[nums.length];
        for (int i = 0; i < dp.length; i++) dp[i] = 1;
        for (int i = 0; i < nums.length; i++) {
            int locMax = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i]) locMax = Math.max(locMax, dp[j]);
            } //for
            dp[i] = locMax + 1;
            globalMax = Math.max(globalMax, locMax);
        } //for
        return globalMax;
    } //lengthOfLIS
} //Solution