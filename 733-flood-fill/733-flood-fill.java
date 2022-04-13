class Solution {
    int[][] dirs={
        {0,1},
        {1,0},
        {0,-1},
        {-1,0}
    };
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
          solve(image,sr,sc,newColor);
        return image;
    }
    private void solve(int[][] a,int r,int c,int ncol){
        int cc=a[r][c];
        a[r][c]=-1;
        for(int[] d:dirs){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 && nc>=0 && nr<a.length && nc<a[0].length && a[nr][nc]==cc){
                solve(a,nr,nc,ncol);
            }
        }
        a[r][c]=ncol;
    }
}
