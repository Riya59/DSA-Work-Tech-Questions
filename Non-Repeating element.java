class Solution {
   int findNonRepeatingElement (int[] arr) {
       int n = arr.length;
       int low = 0, high = n-1, mid;
       while (low <= high) {
           mid = (high + low) / 2;
           if (low == high) {
               return arr[mid];
           }
           if (mid % 2 == 0) {
               if (arr[mid] == arr[mid + 1]) {
                   low = mid + 1;
               } else {
                   high = mid;
               }
           } else {
               if (arr[mid] == arr[mid - 1]) {
                   low = mid + 1;
               } else {
                   high = mid;
               }
           }
       }
       return 0;
   }
}
