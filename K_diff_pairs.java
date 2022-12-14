class Solution {
    int kDiffPairs (int[] A, int k) {
        // add your logic here
        int n = A.length;
        int i = 0, j = 1;
        int count = 0;
        while (j < n) {
            while (j < (n - 1) && A[j] == A[j + 1]) {
                j++;
            }
            int diff = A[j] - A[i];
            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }
			if (i == j) {
				j++;
			}
        }

        return count;
    }
}
