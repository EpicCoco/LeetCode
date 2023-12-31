class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[][] dist = new int[26][2];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (dist[idx][0] == 0) dist[idx][0] = i + 1;
        } //for
        for (int i = s.length() - 1; i >= 0; i--) {
            int idx = s.charAt(i) - 'a';
            if (dist[idx][1] == 0) dist[idx][1] = i + 1;
        } //for
        int max = 0;
        for (int i = 0; i < 26; i++) {
            int num = dist[i][1] - dist[i][0];
            max = Math.max(max, num);
        } //for
        return max - 1;
    }//maxLengthBetweenEqualCharacters
} //Solution