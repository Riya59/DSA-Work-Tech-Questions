class Solution {
	void sort(int arr[],int l,int r){
		int mid;
		if(r>l){
			mid =  (r+l)/ 2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			
			mergeSortImplement(arr,l,mid,r);
		}
	}
	void mergeSortImplement (int[] arr, int l, int m, int r) {
		// add your logic here
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i] = arr[l+i];
		}
		
		for(int j=0;j<n2;j++){
			R[j] = arr[m+1+j];
		}
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k++] = L[i++];
			
		}
		while(j<n2){
			arr[k++] = R[j++];
			
		}
	}
	void mergeSort (int[] arr) {
       int n = arr.length;
       sort (arr, 0, n - 1);
   }

}
