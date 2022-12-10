class Solution {
	void sortTheArray (int[] A) {
	    // add your logic here
		int n = A.length;
		int mid = 0, temp;
		int low = 0;
		int high = n-1;
		while(mid<=high){
			if(A[mid] == 0){
				temp=A[low];
				A[low]=A[mid];
				A[mid]=temp;
				low++;
				mid++;
			}
			else if(A[mid]==1){
				mid++;
			}
			else if(A[mid] == 2){
				temp=A[mid];
				A[mid]=A[high];
				A[high]=temp;
				high--;
			}
		}
		
	}
}
