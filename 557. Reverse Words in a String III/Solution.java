class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String[] split = sb.toString().split(" ");
        sb.setLength(0);
        for (String rev : split) {
            sb.insert(0, rev + " ");
        } //for
        return sb.toString().trim();
    } //reverseWords
} //Solution