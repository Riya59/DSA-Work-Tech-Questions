int getCount(int n){
	int count = 0;
	if(n == 0){
		return 1;
	}
	while(n>0){
		count++;
		n=n/10;
	}
	return count;
}

vector<int> getEvenDigitNumbers(vector<int> &arr) {
    // add your logic here
	vector<int>evenList;
	for(int x: arr){
		if(getCount(x) % 2 == 0){
			evenList.push_back(x);
		}
	}
	return evenList;
}
