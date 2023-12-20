class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices[0] + prices[1];
        if (n > money) return money;
        return money - n;
    } //buyChoco
} //Solution