class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] temp = new int[nums.length + 1];
        int[] toReturn = new int[2];
        for (int num : nums) temp[num]++;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0) toReturn[1] = i;
            if (temp[i] == 2) toReturn[0] = i;
        } //for
        return toReturn;
    } //findErrorNums
} //Solution