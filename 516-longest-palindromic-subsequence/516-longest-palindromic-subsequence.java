class Solution {
    public static int memo(String s1,String s2,int i,int j,int dp[][])
    {
        if(i==-1 || j==-1)
        {
            return 0;
        }
        
        if(dp[i][j]!=-1)
        {
             return dp[i][j];                                                
        }
        

        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=(memo(s1,s2,i-1,j-1,dp)+1);
        }
        
        return dp[i][j]=Math.max(memo(s1,s2,i,j-1,dp),memo(s1,s2,i-1,j,dp));
        
    }
    public int longestPalindromeSubseq(String s1) {
        
        StringBuffer sb=new StringBuffer(s1);
        sb.reverse();
        
        
        String s2=sb.toString();
        
       int dp[][]=new int[s1.length()][s2.length()];

        for(int x[]:dp)
        {
            Arrays.fill(x,-1);
        }
        
       int ans=  memo(s1,s2,s1.length()-1,s2.length()-1,dp);
        return ans;
    }
}

