class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) temp[i] = new Integer(arr[i]);
        Arrays.sort(temp, (a, b) -> {
            int bitA = numOnes(a);
            int bitB = numOnes(b);
            return (bitA == bitB) ? a - b : bitA - bitB;
        });
        for (int i = 0; i < temp.length; i++) arr[i] = temp[i].intValue();
        return arr;
    } //sortByBits

    private int numOnes(int n) {
        int sum = 0;
        while (n >= 1) {
            sum += n % 2;
            n /= 2;
        } //while
        return sum;
    } //sortByBits
} //Solution