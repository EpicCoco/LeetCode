class Solution {
    public String largestGoodInteger(String num) {
        String toReturn = " ";
        char[] numChar = num.toCharArray();
        for (int i = 2; i < num.length(); i++) {
            char c = numChar[i];
            if (numChar[i-2] == c && numChar[i-1] == c) {
                if (toReturn.charAt(0) < c) toReturn = (c + "" + c + "" + c);
                i+=2;
            } //if
        } //for
        return toReturn.trim();
    } //largestGoodInteger
} //Solution