class Solution {
	int[] searchRange (int[] arr, int key) {
		// add your logic here
		int n = arr.length;
		int first = -1,last = -1;
		for(int i=0;i<n;i++){
			if(first == -1 && arr[i] == key){
				first = i;
			}
			if(arr[i] == key){
				last = i;
			}
		}
		int index[] = {first,last};
		return index;
		
	}
}
