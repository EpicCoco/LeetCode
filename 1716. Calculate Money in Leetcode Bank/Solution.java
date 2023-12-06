class Solution {
    public int totalMoney(int n) {
        int total = 0, r = n % 7;
        n /= 7;
        for (int i = 1; i <= n; i++) total += 21 + (i * 7);
        for (int i = 1; i <= r; i++) total += (n + i);
        return total;
    } //totalMoney
} //Solution