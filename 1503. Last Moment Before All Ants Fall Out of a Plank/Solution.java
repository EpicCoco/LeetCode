class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = getMax(left);
        int rightMin = getMin(right);
        return Math.max(n - rightMin, leftMax);
    } //getLastMoment

    private static int getMin(int[] arr) {
        int min = 10001;
        for (int num : arr) {
            if (num < min) min = num;
        } //for
        return min;
    } //getMin

    private static int getMax(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) max = num;
        } //for
        return max;
    } //getMax
} //Solution