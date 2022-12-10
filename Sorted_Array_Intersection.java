class Solution {
	List<Integer> intersection (int[] A, int[] B) {
		// add your logic here
		int n1 = A.length;
		int n2 = B.length;
		List<Integer> arr = new ArrayList<>();
		int i=0,j=0;
		while(i<n1 && j<n2){
			if(A[i]<B[j]){
				i++;
			}
			else if(B[j]<A[i]){
				j++;
			}
			else{
				arr.add(B[j]);
				i++;
				j++;
			}
		}
		Collections.sort(arr);
		return arr;
	}
}
