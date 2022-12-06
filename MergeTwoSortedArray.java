class Solution {
   int[] mergeSortedArrays(int[] A, int[] B) {
       int C[] = new int[A.length + B.length];
       for (int i = 0; i < A.length; i++) {
           C[i] = A[i];
       }
       for (int i = 0; i < B.length; i++) {
           C[A.length + i] = B[i];
       }
       Arrays.sort(C);
       return C;
   }
}
