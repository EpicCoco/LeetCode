class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length - 1;
        int score = 0;
        while (l <= r) {
            if (tokens[l] > power) {
                if (score == 0) return 0;
                else {
                    if (l == r) return score;
                    power += tokens[r];
                    r--;
                    score--;
                } //if
            } else {
                power -= tokens[l];
                score++;
                l++;
            } //if
        } //while
        return score;
    } //bagOfTokensScore
} //Solution