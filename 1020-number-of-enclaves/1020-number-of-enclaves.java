class Solution {
    public void floodfill(int a[][],int i,int j)
    {
        if(i>=0 && j>=0 && i<a.length && j<a[0].length&&a[i][j]==1)
        {
            a[i][j]=0;
            
            // here follow TLDR top left down right
            floodfill(a,i-1,j);
            floodfill(a,i,j-1);
            floodfill(a,i+1,j);
            floodfill(a,i,j+1);
        }
        return;
    }
    public int numEnclaves(int[][]a) {
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i==0 || j==0 || i==a.length-1|| j==a[0].length-1)
                {
                     floodfill(a,i,j);
                }
            }
        }
        
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                {
                    c++;
                }
            }
        }
        return c;
    }
}