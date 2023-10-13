class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //do length plus one to account for if skip last element
        int[] dp = new int[cost.length + 1];
        //initialize dp
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length + 1; i++) {
            //cost of self (if element beyond array, cost is zero)
            int selfCost = (i > cost.length - 1 ? 0 : cost[i]);
            //dp[i] is min of the last two steps plus current cost
            dp[i] = Math.min(dp[i-1], dp[i-2]) + selfCost;
        } //for
        //return last cost (cost of final element which is one
        // beyond last element (account for skip last step)
        return dp[cost.length];
    } //minCostClimbingStairs
} //Solution