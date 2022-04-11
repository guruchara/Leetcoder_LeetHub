class Solution {    
    public static int check(String s1, String s2,int m,int n,int dp[][])
    {
        if(dp[m][n]!=0)
        {
            return dp[m][n];
        }
        if(m==0|| n==0)
        {
            return dp[m][n]=0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            dp[m][n]=check(s1,s2,m-1,n-1,dp)+1;
        }
        else
        {
            dp[m][n]=Math.max(check(s1,s2,m-1,n,dp),check(s1,s2,m,n-1,dp));
        }
        return dp[m][n];
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        return check(s1,s2,m,n,dp);
    }
}