class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        int[] toReturn = new int[nums.length];
        for (int i : nums) {
            if (i % 2 == 0) {
                toReturn[l] = i;
                l++;
            } else {
                toReturn[r] = i;
                r--;
            } //if
        } //for
        return toReturn;
    } //sortArrrayByParity
} //Solution