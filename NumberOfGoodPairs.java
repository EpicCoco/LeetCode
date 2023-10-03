class Solution {
    public int numIdenticalPairs(int[] nums) {
        int max = 0;
        for (int i : nums) max = Math.max(max, i);
        int[] count = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        } //for
        int numPairs = 0;        
        for (int i = 0; i < nums.length; i++) {
            if (count[nums[i]] != 0) {
                count[nums[i]]--;
                numPairs += count[nums[i]];
            } //if
        } //for
        return numPairs;
    } //numindenticalPairs
} //Solution