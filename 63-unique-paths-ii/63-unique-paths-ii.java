class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        return paths(0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid,new int[obstacleGrid.length][obstacleGrid[0].length]);
    }
	
	 //sr:source row , sc: source column
     //dr: destination row , dc: destination column 
	 //qb: question bank to ask question have we solved this row and col before ? if yes then why to solve again
	 
    public static int paths(int sr,int sc,int dr,int dc,int[][] grid,int[][] qb){
        if(sr==dr && sc==dc && grid[sr][sc]==0) return 1;
        
        if(sr>dr || sc>dc || grid[sr][sc]==1) return 0; // if 
		
        if(qb[sr][sc]!=0) return qb[sr][sc];
		
        int iv=paths(sr+1,sc,dr,dc,grid,qb); //iv: intermediate vertical
        int ih=paths(sr,sc+1,dr,dc,grid,qb); // intermediate horizontal
        
        int tp=iv+ ih; //tp: total path
        qb[sr][sc]=tp;
        return tp;
    }
}