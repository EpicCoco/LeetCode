class Solution {
    public int countPalindromicSubsequence(String s) {
        char[] string = s.toCharArray();
        int[] charsLeft = new int[26];
        int[] charsRight = new int[26];
        HashSet<Integer> check = new HashSet<>();
        
        for (int i = 0; i < string.length; i++) {
            charsRight[string[i]-'a']++;
        } //for
        int total = 0;
        for (int i = 0; i < string.length; i++) {
            charsRight[string[i]-'a']--;
            for (int j = 0; j < charsLeft.length; j++) {
                if (charsLeft[j] > 0 && charsRight[j] > 0 && check.add((j*100) + string[i])) total++;
            } //for
            charsLeft[string[i]-'a']++;
        } //for
        return total;

    } //countPalindromicSubsequence
} //Solution