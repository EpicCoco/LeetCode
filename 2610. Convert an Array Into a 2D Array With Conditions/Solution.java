class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[0];
        int maxLength = 1, length = 1;
        //find mode (maxLength)
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num == prev) length++;
            else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            } //if
            prev = num;
        } //for
        maxLength = Math.max(maxLength, length);
        List<List<Integer>> toReturn = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) toReturn.add(new ArrayList<Integer>());
        int currList = 0, numCount = 0;
        prev = nums[0];
        toReturn.get(0).add(prev);
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (prev == num) currList++;
            else currList = 0;
            toReturn.get(currList).add(num);
            prev = num;
        } //for
        return toReturn;
    } //findMatrix
} //Solution