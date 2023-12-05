class Solution {
    public int numberOfMatches(int n) {
        int total = 0;
        while (n > 2) total += (n = ++n/2);
        return total;
    } //numberOfMatches
} //Solution