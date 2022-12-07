class Solution {
	void nextGreaterPermutation (int[] arr) {
		// add your logic here
		int n = arr.length;
		reverse(arr,0,n-1);
		if(isSorted(arr) == true){
			return;
		}
		int index = 0;
		for(int i=1;i<n;i++){
			if(arr[i-1]>arr[i]){
				index = i;
				break;
			}
		}
		for(int i=0;i<index;i++){
			if(arr[i]>arr[index]){
				swap(arr,i,index);
				break;
			}
		}
		reverse(arr,0,index-1);
		reverse(arr,0,n-1);
	}
	boolean isSorted(int arr[]){
		int n = arr.length;
		boolean sorted = true;
		for(int j=1;j<n;j++){
			if(arr[j]<arr[j-1]){
				sorted = false;
			}
		}
		return sorted;
	}
	void reverse(int arr[],int start, int end){
		int left = start, right = end;
		while(left<right){
			swap(arr,left,right);
			left++;
			right--;
		}
	}
	void swap(int arr[], int first, int second){
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
}
