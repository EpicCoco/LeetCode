class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length / 2; i++) {
            if (vowels.indexOf(str[i]) != -1) count++;
        } //for
        for (int i = str.length / 2; i < str.length; i++) {
            if (vowels.indexOf(str[i]) != -1) count--;
        } //for
        return count == 0;
    } //halvesAreAlike
} //Solution