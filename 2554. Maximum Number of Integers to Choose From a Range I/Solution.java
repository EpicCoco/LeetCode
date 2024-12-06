class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int output = 0;
        int sumTotal = 0;
        int bannedIdx = 0;
        for (int i = 1; i <= n; i++) {
            if (i + sumTotal > maxSum) return output;

            while (bannedIdx < banned.length && banned[bannedIdx] < i) bannedIdx++;
            
            if (bannedIdx == banned.length || banned[bannedIdx] != i) {
                output++;
                sumTotal += i;
            } // if
            
        } // for

        return output;
    } // maxCount
} // Solution