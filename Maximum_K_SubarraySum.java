class Solution {
	int maxKSubarraySum (int[] A, int k) {
		// add your logic here
		int n = A.length;
		int sum = 0;
		int maxi=0;
		
		for(int i=0;i<k;i++){
			sum = sum + A[i];
		}
		maxi=Math.max(sum,maxi);
	
		for(int i=k;i<n;i++){
			sum = sum - A[i-k];
			sum = sum + A[i];
			maxi = Math.max(sum,maxi);
		}
		
		return maxi;
	}
}
