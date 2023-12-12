class Solution {
    public String mergeAlternately(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder toReturn = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            toReturn.append(word1.charAt(i));
            toReturn.append(word2.charAt(i));
        } //for
        toReturn.append(word1.substring(minLength));
        toReturn.append(word2.substring(minLength));
        return toReturn.toString();
    } //mergeAlternately
} //Solution