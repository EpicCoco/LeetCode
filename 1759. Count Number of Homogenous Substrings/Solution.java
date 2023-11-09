class Solution {
    public int countHomogenous(String s) {
        char[] arr = s.toCharArray();
        int m = 1000000007;
        int total = 0;
        char prev = arr[0];
        int seq = 1;
        for (int i = 1; i < arr.length; i++) {
            char c = arr[i];
            if (c == prev) seq++;
            else seq = 1;
            total = (total + seq) % m;
            prev = c;
        } //for
    return total + 1;
    } //countHomogenous
} //Solution