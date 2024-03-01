class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') count++;
        } //for
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < count; i++) {
            sb.append('1');
        } //for
        for (int i = 0; i < n - count; i++) {
            sb.append('0');
        } //for
        sb.append('1');
        return sb.toString();
    } //maximumOddBinaryNumber
} //Solution