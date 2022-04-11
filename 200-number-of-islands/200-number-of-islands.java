class Solution {
    public void floodfill(char a[][],int i,int j)
    {
       if(i<a.length && j<a[0].length && i>=0 && j>=0 && a[i][j]=='1')   
      {                  
         a[i][j]='0';
        floodfill(a,i-1,j);
        floodfill(a,i,j-1);
        floodfill(a,i+1,j);
        floodfill(a,i,j+1);             
       }
    }
    public int numIslands(char[][] a) {
        
         int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]=='1')
                {
                    floodfill(a,i,j);
                    c++;
                }
            }
        }
        return c;
    }
}

