
class Solution {
   int[] getNthRow(int rowNo){
       int[] currentRow = new int[rowNo + 1];
       int[] prevRow = new int[rowNo + 1];
       currentRow[0] = 1;
       if (rowNo == 0) {
           return currentRow;
       }
       prevRow = getNthRow(rowNo - 1);
       int i = 0;
       for (i = 1; i < rowNo; i++) {
           currentRow[i] = (prevRow[i - 1] + prevRow[i]);
       }
       currentRow[i] = 1;
       return currentRow;
   }
   int[] pascalTriangleRow(int rowNo) {
       int pascalRow[] = new int[rowNo + 1];
       pascalRow = getNthRow(rowNo - 1);
       int pascalNthRow[] = new int[rowNo];
       for (int i = 0; i < rowNo; i++) {
           pascalNthRow[i] = pascalRow[i];
       }
       return pascalNthRow;
   }
}
