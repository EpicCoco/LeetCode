class Solution {
    public int minOperations(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' && i % 2 == 0) count++;
            else if (c == '1' && i % 2 == 1) count++;
        } //for
        return Math.min(count, s.length() - count);
    } //minOperations 
} //Solution