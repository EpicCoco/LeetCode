class Solution {
    public int countCharacters(String[] words, String chars) {
        int total = 0;
        int[] charsFreq = new int[26];
        for (char c : chars.toCharArray()) charsFreq[c-'a']++;
        for (String word : words) total += checkContains(word, charsFreq);
        return total;
    } //countCharacters

    private int checkContains(String word, int[] charsFreq) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            int idx = (c-'a');
            freq[idx]++;
            if (freq[idx] > charsFreq[idx]) return 0;
        } //for
        return word.length();
    } //checkContains
} //Solution