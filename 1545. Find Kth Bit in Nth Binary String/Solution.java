class Solution {
    public char findKthBit(int n, int k) {
        if (k == 1) return (char) (0 + '0');
        k++;
        int[] nums = new int[k];
        nums[0] = 0;
        int order = 1;
        for (int i = 1; i < k; i++) {
            if ((i + 1) >> 1 == order) {
                order *= 2;
                nums[i] = 1;
            } else nums[i] = nums[order - (i - order)] == 0 ? 1 : 0;
        } // for
        return (char) (nums[k - 1] + '0');
    } // findKthBit
} // Solution