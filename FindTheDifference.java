class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] strs = s.toCharArray();
        char[] strt = t.toCharArray();
        int[] counts = new int[26];
        for (char c : strs) {
            counts[(int)(c - 'a')]++;
        } //for
        for (char c : strt) {
            int num = (int)(c - 'a');
            counts[num]--;
            if (counts[num] < 0) {
                return c;
            } //if
        } //for
        return 'a';
    } //findTheDifference
} //FindTheDifference