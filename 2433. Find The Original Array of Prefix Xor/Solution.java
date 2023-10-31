class Solution {
    public int[] findArray(int[] pref) {
        int[] toReturn = new int[pref.length];
        toReturn[0] = pref[0];
        for (int i = 1; i < toReturn.length; i++) {
            toReturn[i] = pref[i - 1] ^ pref[i];
        } //for
        return toReturn;
    } //findArray
} //Solution