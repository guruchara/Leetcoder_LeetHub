class Solution {
    
    public int[][] transpose(int[][] a) {
     
          int res[][]=new int[a[0].length][a.length];
        
          for(int i=0;i<a.length;i++)
          {
              for(int j=0;j<a[0].length;j++)
              {
                  res[j][i]=a[i][j];
              }
          }
        return res;
    }
}