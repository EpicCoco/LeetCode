class Solution {
    public boolean isAnagram(String s, String t) {
        int[] seenS = new int[26],  seenT = new int[26];
        for (char c : s.toCharArray()) seenS[c-'a']++;
        for (char c : t.toCharArray()) seenT[c-'a']++;
        for (int i = 0; i < 26; i++) if (seenS[i] != seenT[i]) return false;
        return true;
    } //isAnagram
} //Solution