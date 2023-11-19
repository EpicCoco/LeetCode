class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 1;
        for (int i = (nums.length - 1); i > 0; i--) {
            int target = nums[i], locK = k, locMax = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (target == nums[j]) {
                    i--;
                    locMax++;
                } else {
                    locK -= (target - nums[j]);
                    if (locK >= 0) locMax++;
                    else break;
                } //if
            } //for
            max = Math.max(locMax, max);
        } //for
        return max;
    } //maxFrequency
} //Solution