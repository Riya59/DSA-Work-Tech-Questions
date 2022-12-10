class Solution {
	int calculateMedianOfMatrix(int[][] matrix){
	    int n = matrix.length;
		int m = matrix[0].length;
		int ind = 0;
		int arr[] = new int[n*m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[ind] = matrix[i][j];
				ind++;
			}
		}
		Arrays.sort(arr);
		int median = ind/2;
		return arr[median];
		
	}
}
