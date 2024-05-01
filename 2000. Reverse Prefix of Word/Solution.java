class Solution {
    public String reversePrefix(String word, char ch) {
        boolean flip = false;
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (flip) sb.append(c);
            else sb.insert(0, c);
            if (c == ch) flip = true;
        } //for
        if (!flip) return word;
        return sb.toString();
    } //reversePrefix
} //Solution