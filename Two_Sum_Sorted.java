class Solution {
	boolean hasTwoSumZero (int[] A) {
		// add your logic here
		int n = A.length;
		int left,right;
		left = 0; right = n-1;
		while(left<right){
			if(A[left] + A[right] == 0){
				return true;
			}
			else if(A[left]+A[right]>0){
				right--;
			}
			else{
				left++;
			}
		}
		return false;
	}
}
