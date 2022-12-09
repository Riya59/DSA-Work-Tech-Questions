class Solution {
	int getInsertPosition (int[] arr, int key) {
		// add your logic here
		int n = arr.length;
		for(int i=0;i<n;i++){
			if(arr[i] == key){
				return i;
			}
			else if(arr[i]>key){
				return i;
			}
		}
		return n;
	}
}
