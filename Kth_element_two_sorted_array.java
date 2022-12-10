class Solution {
	int getKthElement(int[] firstArr, int[] secondArr, int k) {
	   // add logic here
		int index = 0;
		int thirdArr[] = new int[firstArr.length + secondArr.length];
		for(int i=0;i<firstArr.length;i++){
			thirdArr[index] = firstArr[i];
			index++;
		}
		for(int j=0;j<secondArr.length;j++){
			thirdArr[index] = secondArr[j];
			index++;
		}
		Arrays.sort(thirdArr);
		
		return thirdArr[k-1];
		
	}
}
