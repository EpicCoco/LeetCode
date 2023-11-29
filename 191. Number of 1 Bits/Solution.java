public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int total = 0;
        for (int i = 0; i < 32; i++) {
            total += Math.abs(n) % 2;
            n >>= 1;
        } //for
        return total;
    } //hammingWeight
} //Solution