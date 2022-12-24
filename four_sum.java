class Solution {
   List<List<Integer>> fourSum(int[] a, int target) {
       int n = a.length;
       Arrays.sort(a);
       List<List<Integer>> answer = new ArrayList<>();
       for (int i = 0; i < n; i++){
           if(i != 0 && a[i] == a[i-1]) {
               continue;
           }
           for (int j = i + 1; j < n; j++) {
               if(j != i + 1 && a[j] == a[j-1]) {
                   continue;
               }
               int first = j + 1, last = n - 1;
               while (first < last) {
                   int sum = a[i] + a[j] + a[first] + a[last];
                   if(sum == target) {
                       List<Integer> list = new ArrayList<>();
                       list.add(a[i]);
                       list.add(a[j]);
                       list.add(a[first]);
                       list.add(a[last]);
                       answer.add(list);
                       while (first < last && a[first] == a[first+1]) {
                           first++; 
                       }
                       while (first < last && a[last] == a[last-1]) {
                           last--;
                       }
                       first++;
                       last--;
                   }
                   else if(sum < target) {
                       first++;
                   }
                   else {
                       last--;
                   }
               }
           }
       }
       return answer;
   }
}
