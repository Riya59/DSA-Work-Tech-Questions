class Solution {
	int getKthLargestElement(int[] list, int k) {
	    // add your logic here
		int n = list.length;
		Arrays.sort(list);
		return list[n-k];
	}
}
