// class Solution {
//     public int largestIsland(int[][] grid) {
//         if(grid==null || grid.length==0) return 0;
//         int max=dfs(grid,0,0,new boolean[grid.length][grid[0].length]);
        
//         boolean visited[][]=new boolean [grid.length][grid[0].length];
        
//         for(int i=0;i<grid.length;i++){
//             for(int j=0;j<grid[0].length;j++){
//                 if(grid[i][j]==0){
//                     grid[i][j]=1;
//                     max=Math.max(max,dfs(grid,i,j,new boolean[grid.length][grid[0].length]));
//                     grid[i][j]=0;
//                 }
//             }
//         }
//         return max;
//     }
    
//     public int dfs(int grid[][], int i, int j, boolean visited[][]){
//         if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1 && !visited[i][j]){
//             int area=1;
//             visited[i][j]=true;

//             area+=dfs(grid,i+1,j,visited);
//             area+=dfs(grid,i-1,j,visited);
//             area+=dfs(grid,i,j+1,visited);
//             area+=dfs(grid,i,j-1,visited);
            
//             return area;
//         }
//         else return 0;
//     }
// }
class Solution {
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        
        int color=2;
        int A[]=new int[n*n+2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    A[color]=getColor(grid,i,j,color++);
                }
            }
        }
        
        boolean seeZero=false;
        int ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    seeZero=true;
                    
                    Set<Integer> set=new HashSet<>();
                    
                    if(i-1>=0) set.add(grid[i-1][j]);
                    if(j-1>=0) set.add(grid[i][j-1]);
                    if(i+1<n) set.add(grid[i+1][j]);
                    if(j+1<n) set.add(grid[i][j+1]);
                    
                    int area=1;
                    for(int x:set){
                        area+=A[x];
                    }
                    ans=Math.max(ans,area);
                }
            }
        }
        return seeZero ? ans : n*n;
    }
    
    public int getColor(int grid[][], int i, int j, int color){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1) return 0;
        else{
            grid[i][j]=color;
            
            return 1+getColor(grid,i+1,j,color)+getColor(grid,i,j+1,color)
					+getColor(grid,i,j-1,color)+getColor(grid,i-1,j,color);
        }
    }
}