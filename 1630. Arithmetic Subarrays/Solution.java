class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> toReturn = new ArrayList<Boolean>();
        for (int i = 0; i < l.length; i++) {
            int left = l[i], right = r[i];
            int[] temp = new int[right - left + 1];
            for (int j = 0; j < temp.length; j++) {
                temp[j] = nums[left + j];
            } //for
            Arrays.sort(temp);
            toReturn.add(checkArithmetic(temp));
        } //for
        return toReturn;
    } //checkArithmeticSubarrays

    private boolean checkArithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int j = 2; j < arr.length; j++) {
            if (arr[j] - arr[j - 1] != diff) return false;
        } //for
        return true;    
    } //checkArithmetic
} //Solution