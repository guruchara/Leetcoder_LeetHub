// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java


// if try to solve this question by using recursion i got TLE 
// so now i am move o memoiozation

class Solution{
    public static int goldcollect(int a[][],int i,int j, int r,int c,int dp[][])
    {
        
        if(i<0 || j<0 || i==r || c==j)
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        //rud right upper diagonal
        int rud=goldcollect(a,i-1,j+1,r,c,dp);
        
        //right  now i am calling in right side 
        int right=goldcollect(a,i,j+1,r,c,dp);
        
        // rdd right down diagonal
        int rdd=goldcollect(a,i+1,j+1,r,c,dp);
        
        int max=Math.max(Math.max(rud,rdd),right);
        
        return dp[i][j]= max+a[i][j];
    }
    public static int maxgold(int a[][],int r,int c)
    {
        int dp[][]=new int[r][c];
        
         for(int val[]:dp)
         {
             Arrays.fill(val,-1);
         }
         
        int max=0;
        
        for(int i=0;i<a.length;i++){
            
            max=Math.max(max,goldcollect(a,i,0,r,c,dp));
        }
        return max;
    }
    static int maxGold(int n, int m, int M[][])
    {
         int ans=maxgold(M,n,m);
         return ans;
    }
}