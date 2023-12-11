class Solution {
    public int findSpecialInteger(int[] arr) {
        int num = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == num) count++;
            else {
                num = arr[i];
                count = 1;
            } //if
            if (count > arr.length / 4) return num;
        } //for
        return num;
    } //findSpecialInteger
} //Solution