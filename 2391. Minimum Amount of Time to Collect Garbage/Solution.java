class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] newTravel = new int[garbage.length];
        for (int i = 1; i < newTravel.length; i++) newTravel[i] = travel[i - 1] + newTravel[i - 1];
        int total = 0;
        int[] last = new int[3];
        for (int i = 0; i < garbage.length; i++) {
            char[] garbageChar = garbage[i].toCharArray();
            for (int j = 0; j < garbageChar.length; j++) {
                total++;
                int index = garbageChar[j] == 'M' ? 0 : garbageChar[j] == 'P' ? 1 : 2;
                total += newTravel[i] - newTravel[last[index]];
                last[index] = i;
            } //for
        } //for
        return total;
    } //garbageCollection
} //Solution