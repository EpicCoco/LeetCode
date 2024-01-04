class Solution {
    static int total;
    public int minOperations(int[] nums) {
        total = 0;
        Arrays.sort(nums);
        int prev = nums[0], count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == prev) count++;
            else {
                if (count == 1) return -1;
                add(count);
                count = 1;
            } //if
            prev = num;
        } //for
        if (count == 1) return -1;
        add(count);
        return total;
    } //minOperations

    private static void add(int count) {
        while (count % 3 != 0) {
            count -= 2;
            total++;
        } //while
        total += count / 3;
    } //add
} //Solution