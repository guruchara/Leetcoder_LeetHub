class Solution {
    
    public int getgold(int a[][],int r,int c,int visited[][])
    {
        if(r>a.length-1|| r<0 || c<0 || c>a[0].length-1 || a[r][c]==0||visited[r][c]==1)
        {            
            return 0;
        }
        
        visited[r][c]=1;
        int t=getgold(a,r-1,c,visited);
        int d=getgold(a,r+1,c,visited);
        int left=getgold(a,r,c-1,visited);
        int right=getgold(a,r,c+1,visited);
        
        visited[r][c]=0;
        return Math.max(Math.max(t,d),Math.max(left,right))+a[r][c];
    } 
    public int getMaximumGold(int[][] a) {
        
        int visited[][]=new int[a.length][a[0].length];
        
        int ans=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]!=0)
                {
                    ans=Math.max(ans,getgold(a,i,j,visited));                                                        }
            }
        }
         return ans;
    }
}