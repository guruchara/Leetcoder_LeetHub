// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public void floodfill(char a[][],int i,int j)
    {
        if(i>=0 && j>=0 && i<a.length && j<a[0].length && a[i][j]=='1')
        {
            a[i][j]='0';
            
            floodfill(a,i,j-1);
            floodfill(a,i-1,j-1);
            floodfill(a,i-1,j);
            floodfill(a,i-1,j+1);
            floodfill(a,i,j+1);
            floodfill(a,i+1,j+1);
            floodfill(a,i+1,j);
            floodfill(a,i+1,j-1);
        }
        return;
    }
    public int numIslands(char[][] grid) {
        
          int c=0;
         for(int i=0;i<grid.length;i++)
         {
             for(int j=0;j<grid[0].length;j++)
             {
                 if(grid[i][j]=='1')
                 {
                     floodfill(grid,i,j);
                     c++;
                 }
             }
         }
         return c;
    }
}