class Solution {
	int getMaxConsecutiveOnes(int[] A) {
	    // add your logic here
		int n = A.length;
		int maxc = 0;
		for(int i=0;i<n;i++){
			int c1 = 0;
			for(int j=i;j<n;j++){
				if(A[j] == 1){
					c1++;
				}
				else{
					break;
				}
			}
			if(c1 > maxc){
				maxc = c1;
			}
		}
		return maxc;
	}
}
