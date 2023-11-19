class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int total = 0, curr = 0, prev = nums[0];
        for (int num : nums) {
            if (num != prev) {
                prev = num;
                curr++;
            } //if
            total += curr;
        } //for
        return total;
    } //reductionOperations
} //Solution