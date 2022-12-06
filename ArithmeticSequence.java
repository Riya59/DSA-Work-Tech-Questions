class Solution {
	boolean isArithmeticSequence (int[] arr) {
		// add your logic here
		int n = arr.length;
		if(n == 1){
			return true;
		}
		Arrays.sort(arr);
		int d;
		d = arr[1] - arr[0];
		// boolean flag = false;
		for(int i=1;i<n;i++){
		if(arr[i] - arr[i-1] != d){
			return false;
		}
			
		}
		return true;

	}
}
