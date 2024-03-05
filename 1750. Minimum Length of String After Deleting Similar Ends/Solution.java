class Solution {
    public int minimumLength(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;
        char same = ' ';
        while (l < r) {
            if (ch[l] == ch[r]) {
                same = ch[l];
                l++;
                r--;
            } //if
            else if (ch[l] == same) l++;
            else if (ch[r] == same) r--;
            else if (ch[l] != ch[r] && ch[l] != same && ch[r] != same) break; 
        } //while
        if (same == ch[l]) return 0;
        return (r - l) + 1;
    } //minimumLength
} //Solution