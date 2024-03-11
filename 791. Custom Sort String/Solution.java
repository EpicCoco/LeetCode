class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c-'a']++;
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            int num = freq[c-'a'];
            for (int i = 0; i < num; i++) {
                sb.append(c);
            } //for
            freq[c-'a'] = 0;
        } //for
        for (int i = 0; i < 26; i++) {
            int n = freq[i];
            for (int j = 0; j < n; j++) {
                sb.append((char)(i+'a'));
            } //for
        } //for
        return sb.toString();
    } //customSortString
} //Solution