class Solution {
    
     // Hint : By using floodfill we can solve
    // find max area of island
    public int floodfill(int a[][],int i,int j)
    {
      if(i>=0 && j>=0 && i<a.length && j<a[0].length && a[i][j]==1)
      {
          a[i][j]=0;
          
          int top=floodfill(a,i-1,j);
          int left=floodfill(a,i,j-1);
          int down=floodfill(a,i+1,j);
          int right=floodfill(a,i,j+1);
          
          return 1+top+left+down+right;
      }
        else
        {
            return 0;
        }
    }
    public int maxAreaOfIsland(int[][] a) {
        
          int res=0;
         for(int i=0;i<a.length;i++)
         {
             for(int j=0;j<a[0].length;j++)
             {
                 if(a[i][j]==1)
                 {
                     res=Math.max(res,floodfill(a,i,j));
                 }
                 
             }
         }
        return res;
    }
}