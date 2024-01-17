class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> unique = new HashSet<>();
        int prev = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num == prev) count++;
            else {
                if (!unique.add(count)) return false;
                count = 1;
            } //if
            prev = num;
        } //for
        if (!unique.add(count)) return false;
        return true;
    } //uniqueOccurrences
} //Solution