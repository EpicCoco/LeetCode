class Solution {
    public boolean backspaceCompare(String s, String t) {
        //call method on both strings
        return convertBackspace(s).equals(convertBackspace(t));
    } //backspaceCompare

    //add characters to a stack and pop if '#' encountered
    private String convertBackspace(String s) {
        Stack<Character> st = new Stack<>();
        char[] strs = s.toCharArray();
        for (int i = 0; i < strs.length; i++) {
            char c = strs[i];
            if (c == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(c);
            } //if
        } //for
        return st.toString();
    } //convertBackspace
} //Solution