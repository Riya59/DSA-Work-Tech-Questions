class Solution {
	int getNextGreaterElement (int[] arr, int key) {
		// add your logic here
		int n = arr.length;
    Arrays.sort(arr);
		for(int i=0;i<n;i++){
			if(key<arr[i]){
				return arr[i];
			}
		}
		return key;
		
	}
}
