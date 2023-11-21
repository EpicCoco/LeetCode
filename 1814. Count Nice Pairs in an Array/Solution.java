class Solution {
    public int countNicePairs(int[] nums) {
        int[] pair = new int[nums.length];
        for (int i = 0; i < nums.length; i++) pair[i] = nums[i] - rev(nums[i]);
        Arrays.sort(pair);
        int total = 0, m = 1000000007, seq = 0, prev = pair[0], count = 0;
        for (int i = 1; i < pair.length; i++) {
            if (pair[i] == prev) seq = (++count + seq) % m;
            else {
                total += seq;
                seq = count = 0;
            } //if
            prev = pair[i];
        } //for
        if (pair[nums.length - 1] == prev) total = (total + seq) % m;
        return total;
    } //countNicePairs

    private int rev(int num) {
      int toReturn = 0;
      while (num > 0) {
          toReturn = toReturn * 10 + (num % 10);
          num /= 10;
      } //while
      return toReturn;
  } //rev
} //Solution