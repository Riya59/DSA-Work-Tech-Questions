class Solution {
	boolean searchMatrix(int[][] matrix, int key){
	    int n = matrix.length;
		int m = matrix[0].length;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(matrix[i][j] == key){
					return true;
				}
			}
		}
		return false;
	}
}
