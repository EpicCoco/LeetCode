class Solution {
    public int maxScore(String s) {
        int ones = 0, zeroes = 0, maxScore = 0;
        char[] chars = s.toCharArray();
        if (chars[0] == '0') zeroes++;
        for (int i = 1; i < chars.length; i++) if (chars[i] == '1') ones++;
        for (int i = 1; i < chars.length; i++) {
            maxScore = Math.max(maxScore, ones + zeroes);
            if (chars[i] == '0') zeroes++;
            else ones--;
        } //for
        return maxScore;
    } //maxScore
} //Solution