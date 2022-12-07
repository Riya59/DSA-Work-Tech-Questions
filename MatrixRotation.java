class Solution {
	int[][] rotateMatrix(int[][] matrix){
		int n = matrix.length;
		int m = matrix[0].length;
		int arr[][] = new int[m][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[j][i] = matrix[i][j];
			}
		}
		for(int i=0;i<m;i++){
			int start = 0;
			int end = n-1;
			while(start<end){
				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;
				start++;
				end--;
			}
		}
		
		return arr;
	    
	}
}
