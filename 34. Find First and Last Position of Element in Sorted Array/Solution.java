class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] toReturn = {-1, -1}; //initialize to {-1, -1}
        //1st pass, search below
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = ((r + l) / 2);
            if (nums[mid] > target) r = mid - 1;
            if (nums[mid] < target) l = mid + 1;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    toReturn[0] = mid;
                    break;
                } else {
                    r = mid;
                } //if         
            } ///if
        } //while

        //2nd pass, but search above
        l = toReturn[0] == -1 ? 0 : toReturn[0];
        r = nums.length - 1;
        while (l <= r) {
            int mid = ((r + l) / 2);
            //System.out.println("l:" + l + " r:" + r + " mid:" + mid);
            if (nums[mid] > target) r = mid - 1;
            if (nums[mid] < target) l = mid + 1;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    toReturn[1] = mid;
                    break;
                } else {
                    l = mid + 1;
                } //if         
            } ///if
        } //while

        return toReturn;
    } //searchRange
} //Solution
