class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        char[] chart = t.toCharArray();
        char[] chars = s.toCharArray();
        int charsNum = 0;
        for (int i = 0; i < chart.length; i++) {
            if (charsNum == s.length()) return true;
            if (chars[charsNum] == chart[i]) charsNum++;
        } //for
        return charsNum == s.length();
    } //isSubsequence
} //IsSubsequence