class Solution {
	int getInversionCount(int[] array) {
		// Add your logic here
		int n = array.length;
		int count = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(array[i]>array[j]){
					count++;
				}
			}
		}
		return count;
	}
	
}
