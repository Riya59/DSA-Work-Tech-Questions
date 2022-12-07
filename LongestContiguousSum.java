class Solution {
	int largestContiguousSum(int[] arr){
		int n = arr.length;
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0;i<n;i++){
			sum = sum + arr[i];
			if(maxsum<sum){
				maxsum = sum;
			}
			if(sum<0){
				sum = 0;
			}
		}
		return maxsum;
	}
}
