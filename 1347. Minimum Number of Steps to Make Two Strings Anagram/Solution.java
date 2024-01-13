class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        } //for
        for (char c : t.toCharArray()) {
            freq[c-'a']--;
        } //for
        int total = 0;
        for (int i = 0; i < freq.length; i++) {
            total += Math.abs(freq[i]);
        } //for
        return total / 2;
    } //minSteps
} //Solution