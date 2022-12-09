class Solution {
	int getElementIndex(int[] array, int target) {
	    // add your logic here
		int n = array.length;
		for(int i=0;i<n;i++){
			if(array[i] == target){
				return i;
			}
		}
		return -1;
	}
}
