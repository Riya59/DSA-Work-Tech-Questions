class Solution {
	int[] getCumulativeSum (int[] arr) {
		// add your logic here
		int sum[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int prefix = 0;
			for(int j=0;j<=i;j++){
				prefix = prefix+arr[j];
			}
			sum[i] = prefix;
		}
		return sum;
	}
}
