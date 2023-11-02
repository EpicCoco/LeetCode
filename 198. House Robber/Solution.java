class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        if (nums.length == 3) return Math.max(nums[0] + nums[2], nums[1]);
        int[] dp = new int[nums.length];
        dp[dp.length - 1] = nums[nums.length - 1];
        dp[dp.length - 2] = nums[nums.length - 2];
        dp[dp.length - 3] = nums[nums.length - 3] + nums[nums.length - 1];
        for (int i = nums.length - 4; i >= 0; i--) {
            dp[i] = Math.max(nums[i] + dp[i + 2], nums[i] + dp[i + 3]);
        } //for
        return Math.max(dp[0], dp[1]);
    }//rob
} //Solution