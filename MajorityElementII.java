class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> toReturn = new ArrayList<Integer>();
        int target = nums.length / 3;
        Arrays.sort(nums);
        int count = 1;
        int num = nums[0];
        if (count > target) {
                toReturn.add(num);
            } //if
        for (int i = 1; i < nums.length; i++) {
            
            if (num == nums[i]) {
                count++;
            } else {
                count = 1;
                num = nums[i];
            } //if
            if (count > target && !toReturn.contains(num)) {
                toReturn.add(num);
            } //if
        } //for
            
        return toReturn;
    } //majorityElement
} //Solution