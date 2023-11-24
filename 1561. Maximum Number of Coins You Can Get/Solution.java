class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int toReturn = 0;
        for (int i = piles.length/3; i < piles.length; i+=2) {
            toReturn += piles[i];
        } //for
        return toReturn;
    } //maxCoins
} //Solution