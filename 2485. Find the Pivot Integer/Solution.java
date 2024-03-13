class Solution {
    public int pivotInteger(int n) {
        int r = 0, l = 0;
        for (int i = 1; i <= n; i++) r += i;
        for (int i = 1; i <= n; i++) {
            l += i;
            if (l == r) return i;
            r -= i;
        } //for
        return -1;
    } //pivotInteger
} //Solution