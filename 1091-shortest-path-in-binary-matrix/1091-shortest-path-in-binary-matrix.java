class Solution {

class Pair{
    int i;
    int j;
    int steps;
    
    Pair(int i, int j, int steps){
        this.i = i;
        this.j = j;
        this.steps = steps;
    }
    
}

public int shortestPathBinaryMatrix(int[][] grid) {
    if(grid[0][0] == 1){
        return -1;
    }
    int n = grid.length;
    
    Queue<Pair> pq = new ArrayDeque<>();
    pq.add(new Pair(0, 0, 1));
    
    int arr[][] = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    while(pq.size() > 0){
        Pair rem = pq.remove();
        
        int a = rem.i;
        int b = rem.j;
        
        
        if(a == n-1 && b == n-1){
            return rem.steps;
        } 
        
        for(int i=0; i<8; i++){
            int x = rem.i + arr[i][0];
            int y = rem.j + arr[i][1];
            
            if(isSafe(x, y, grid)){
                pq.add(new Pair(x, y, rem.steps + 1));
                grid[x][y] = 1;
            }
        }
    }
    
    
    return -1;
}

public boolean isSafe(int i, int j, int grid[][]){
    if(i < 0 || j < 0 || i >= grid.length || j>=grid.length || grid[i][j] == 1){
        return false;
    }
    
    return true;
}
}