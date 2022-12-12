class Solution {
	int isVowel(char c){
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return 1;
		}
		return 0;
	}
	int[] kSubstringVowels (String s, int k) {
		// add your logic here
		int n = s.length();
		int arr[] = new int[n-k+1];
		int count = 0;
		
		for(int i=0; i<k; i++){
			count = count + isVowel(s.charAt(i));
		}
		arr[0] = count;
		for(int i=k;i<n;i++){
			count = count - isVowel(s.charAt(i-k)) + isVowel(s.charAt(i));  
			arr[i-k+1] = count;
		}
		
		return arr;
	}
}
