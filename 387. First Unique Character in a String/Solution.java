class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (hm.containsKey(c)) hm.replace(c, hm.get(c) + 1);
            else hm.put(c, 1);
        } //for
        for (int i = 0; i < s.length(); i++) {
            if (hm.get(s.charAt(i)) == 1) return i;
        } //for
        return -1;
    } //firstUniqChar
} //Solution