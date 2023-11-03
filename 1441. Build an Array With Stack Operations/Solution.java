class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> toReturn = new ArrayList<String>();
        int num = 1;
        for (int i = 0; i < target.length; i++) {
            while (num < target[i]) {
                toReturn.add("Push");
                toReturn.add("Pop");
                num++;
            } //while
            toReturn.add("Push");
            num++;
        } //for
        return toReturn;
    } //buildArray
} //Solution