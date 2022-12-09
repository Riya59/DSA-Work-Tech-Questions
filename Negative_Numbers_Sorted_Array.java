class Solution {
	int getNegativeNumbersCount (int[] arr) {
		// add your logic here
		int n = arr.length;
		int count = 0;
		for(int i=0;i<n;i++){
			if(arr[i] < 0){
				count++;
			}
		}
		return count;
	}
}
