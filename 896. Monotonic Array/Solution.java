class Solution {
    public boolean isMonotonic(int[] nums) {
        int pos = 0; 
        while(pos < nums.length - 1 && nums[pos] == nums[pos + 1]) pos++;
        if (pos == nums.length - 1) return true;
        boolean increasing = nums[pos] < nums[pos + 1];
        for (int i = pos; i < nums.length - 1; i++) {
            if (increasing && nums[i] > nums[i+1]) return false;
            else if (!increasing && nums[i] < nums[i+1]) return false;
        } //for
        return true;
    } //isMonotonic
} //Solution