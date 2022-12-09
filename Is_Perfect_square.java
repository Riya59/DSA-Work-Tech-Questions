class Solution {
	boolean searchRoot(int start, int end, int num) {
    if (start > end) {
        return false;
    }
    int mid = start + (end - start)/2;
    int square = mid*mid;
    if (square == num) {
        return true;
    }
    if (square > num) {
        return searchRoot(start, mid - 1, num);
    }
    return searchRoot(mid + 1, end, num);
}
boolean isPerfectSquare(int num) {
    int maxVal = 10000;
    return searchRoot(1, maxVal, num);
}
}
