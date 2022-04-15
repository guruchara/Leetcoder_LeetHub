// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.findMaxArea(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution
{
    public int floodfill(int a[][],int i, int j)
    {
        if(i>=0 && j>=0 && i<a.length && j<a[0].length && a[i][j]==1)
        {
            a[i][j]=0;
            
            // by using TLDR 
            int tl=floodfill(a,i-1,j-1);
            int top= floodfill(a,i-1,j);
            int tr=floodfill(a,i-1,j+1);
            int r=floodfill(a,i,j+1);
            int rdr=floodfill(a,i+1,j+1);
            int rd=floodfill(a,i+1,j);
            int ld=floodfill(a,i+1,j-1);
            int lld=floodfill(a,i,j-1);
           
           
           return tl+top+tr+r+rdr+rd+ld+lld+1;
        }
        else
        {
            return 0;
        }
    }
    public int findMaxArea(int[][] grid)
    {
        int res=Integer.MIN_VALUE;
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    res=Math.max(res,floodfill(grid,i,j));
                }
            }
        }
        return res;
    }
}