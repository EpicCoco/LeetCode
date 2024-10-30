class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        int l = 0, r = n - 1;
        int target = skill[l] + skill[r];
        while (l < r) {
            if (skill[l] + skill[r] != target) return -1;
            l++;
            r--;
        } // while

        long total = 0;
        l = 0;
        r = n - 1;
        while (l < r) {
            total = total + (skill[l] * skill[r]);
            l++;
            r--;
        } // while

        return total;
    } // dividePlayers
} // Solution