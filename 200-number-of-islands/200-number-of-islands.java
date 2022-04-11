class Solution {
    public void floodfill(char a[][],int i,int j)
    {
       if(i<a.length && j<a[0].length && i>=0 && j>=0 && a[i][j]=='1')   
      {                  
         a[i][j]='0';
        floodfill(a,i-1,j);
        floodfill(a,i+1,j);
        floodfill(a,i,j+1);
        floodfill(a,i,j-1);                
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

// public int numIslands(char[][] grid) {
//     int count=0;
//     for(int i=0;i<grid.length;i++)
//         for(int j=0;j<grid[0].length;j++){
//             if(grid[i][j]=='1'){
//                 dfsFill(grid,i,j);
//                 count++;
//             }
//         }
//     return count;
// }
// private void dfsFill(char[][] grid,int i, int j){
//     if(i>=0 && j>=0 && i<grid.length && j<grid[0].length&&grid[i][j]=='1'){
//         grid[i][j]='0';
//         dfsFill(grid, i + 1, j);
//         dfsFill(grid, i - 1, j);
//         dfsFill(grid, i, j + 1);
//         dfsFill(grid, i, j - 1);
//     }
// }
// BFS:

