class Solution {
	
	int searchRoot (int num) {
		if(num == 1 || num == 0){
			return num;
		}
		int i = 1, result = 1;
		while(result<=num){
			i++;
			result = i*i;
		}
		return i-1;
	}
	
}
