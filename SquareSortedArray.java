class Solution {
	 void swap(int temp[],int i,int j){
		int arr1 = temp[i];
		temp[i] = temp[j];
		temp[j] = arr1;
	}
	 int partition(int temp[], int l, int r){
		int pivot = temp[r];
		int i = l-1;
		for(int j=l;j<=r-1;j++){
			if(temp[j]<pivot){
				i++;
				swap(temp,i,j);
			}
		}
		swap(temp,i+1,r);
		return i+1;
	}
	 int[] squareSort(int temp[], int l, int r){
		int pi;
		if(l<r){
			pi = partition(temp,l,r);
			squareSort(temp,l,pi-1);
			squareSort(temp,pi+1,r);	 
		}
		 return temp;
	}
	int[] getSquareSortedArray (int[] arr) {
		// add your logic here
		int n = arr.length;
		int temp[] = new int[n];
		int i;
		for(i=0;i<n;i++){
			temp[i] = arr[i] * arr[i];
		}
		
	    int a[] =  squareSort(temp,0,n-1);
		return a;
		
	}
}
