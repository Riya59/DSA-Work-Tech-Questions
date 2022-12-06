class Solution {
	static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int arr[],int l, int r){
		int pivot = arr[r];
		int i = l-1;
		for(int j=l;j<=r-1;j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,r);
		return (i+1);
	}
	static void quickSortImplementation(int arr[], int l, int r){
		int pi;
		if(l<r){
			pi = partition(arr,l,r);
			quickSortImplementation(arr,l,pi-1);
			quickSortImplementation(arr,pi+1,r);
		}
	}
	void quickSort (int[] arr) {
		// add your logic here
		int n = arr.length;
		quickSortImplementation(arr,0,n-1);
	}
}
