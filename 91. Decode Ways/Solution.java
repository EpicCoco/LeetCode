class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        char[] chars = s.toCharArray();
        int n = s.length() - 1;
        int[] dp = new int[n + 2];
        dp[n + 0] = chars[n] == '0' ? 0 : 1;
        dp[n + 1] = 1;
        for (int i = n - 1; i >= 0; i--) {
            int num = Integer.parseInt(chars[i] + "" + chars[i + 1]);
            if (chars[i] == '0') dp[i] = 0;
            else dp[i] = dp[i + 1];
            if (num > 9 && num < 27) dp[i] += dp[i + 2];
        } //for
        return dp[0];
    } //numDecodings 
} //Solution