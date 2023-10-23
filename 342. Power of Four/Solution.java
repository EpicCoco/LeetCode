class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        double num = (double)n;
        while (num > 1) {
            num /= 4;
            if (Math.floor(num) != num) return false;
        } //while
        return true;
    } //isPowerOfFour
} //Solution