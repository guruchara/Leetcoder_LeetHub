class Solution {
    public int[][] generateMatrix(int n) {
      int [][]res=new int[n][n];
      int totalElement=n*n;
      int count=1;
      int minRow=0,minCol=0;
      int maxRow=n-1,maxCol=n-1;
        while(count<=totalElement){
            for(int i=minCol,j=minRow;i<=maxCol&&count<=totalElement;i++){
                res[j][i]=count;
                count++;
            }
            minRow++;
            for(int i=minRow,j=maxCol;i<=maxRow&&count<=totalElement;i++){
                res[i][j]=count;
                count++;
            }
            maxCol--;
            for(int i=maxCol,j=maxRow;i>=minCol&&count<=totalElement;i--){
                res[j][i]=count;
                count++;
            }
            maxRow--;  
            for(int i=maxRow,j=minCol;i>=minRow&&count<=totalElement;i--){
                res[i][j]=count;
                count++;
            }
            minCol++;  
       }
        return res;
    }
}