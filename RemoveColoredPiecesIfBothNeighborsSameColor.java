class Solution {
    public boolean winnerOfGame(String colors) {
        char[] colorsChar = colors.toCharArray();
        int aliceCount = 0, bobCount = 0;
        for (int i = 1; i < colorsChar.length - 1; i++) {
            if (colorsChar[i - 1] == colorsChar[i] && colorsChar[i] == colorsChar[i + 1]) {
                if (colorsChar[i] == 'A') aliceCount++;
                else bobCount++;
            } //if
        } //for
        return aliceCount > bobCount;
    } //winnerOfGame
} //Solution