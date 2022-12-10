class Solution {
	int[] kSubarraySum (int[] A, int k) {
		// add your logic here
		int n = A.length;
		int it = 0;
		int arr[] = new int[n-k+1];
		int sum = 0;
		for(int i=0;i<k;i++){
			sum = sum + A[i];
		}
		arr[it] = sum;
		it++;
		for(int i=k;i<n;i++){
			sum = sum - A[i-k];
			sum = sum + A[i];
			arr[it] = sum;
			it++;
		}
		return arr;
	}
}
