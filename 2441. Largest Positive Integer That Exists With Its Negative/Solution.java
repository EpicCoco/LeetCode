class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r && nums[l] < 0) {
            if (Math.abs(nums[l]) == nums[r]) return nums[r];
            if (Math.abs(nums[l]) > nums[r]) l++;
            else r--;
        } //while
        return -1;
    } //findMaxK
} //Solution