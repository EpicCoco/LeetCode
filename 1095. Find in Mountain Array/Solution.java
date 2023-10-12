class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length() - 1;
        //find peak
        int peak = binarySearchMax(mountainArr, 0, length);
        //search left first
        int leftCheck = binarySearchLeft(mountainArr, 0, peak, target);
        if (leftCheck != -1) return leftCheck;
        //then check right
        return binarySearchRight(mountainArr, peak, length, target);
    } //findMountainArray

    //search for the peak of the mountain
    private int binarySearchMax(MountainArray mountainArr, int l, int r) {
        while (l != r) {
            int mid = l + (r - l) / 2;
            int mNum = mountainArr.get(mid);
            int mNumNext = mountainArr.get(mid + 1);
            if (mNum < mNumNext) {
                l = mid + 1;
            } else {
                r = mid;
            } //if
        } //while
        return l;
    } //binarySearchMax

    //binary search code modified from GeeksForGeeks
    //https://www.geeksforgeeks.org/binary-search/
    private int binarySearchLeft(MountainArray mountainArr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int num = mountainArr.get(mid);
            if (num == target) return mid;
            if (num < target) l = mid + 1;
            else r = mid - 1;
        } //while
        return -1; //not found
    } //binarySearchLeft

    private int binarySearchRight(MountainArray mountainArr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int num = mountainArr.get(mid);
            if (num == target) return mid;
            if (num > target) l = mid + 1;
            else r = mid - 1;
        } //while
        return -1; //not found
    } //binarySearchLeft
} //Solution