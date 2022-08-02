class Solution {
    
    
    // tle because of recursion so now i move on memoiozation ... 
//     public int minPath(int i,int j, int m,int n,int arr[][]){
        
        
//            if(i>=n ||  j>=m){
//                return Integer.MAX_VALUE;
//            }
        
        
//            if(i==arr.length-1 &&  j==arr[0].length-1){
//                return arr[i][j];
//            }
        
//           return arr[i][j]+Math.min(minPath(i+1,j,m,n,arr),minPath(i,j+1,m,n,arr));
//     }
//     public int minPathSum(int[][] arr) {
        
        
//           int n=arr.length;
//           int m=arr[0].length;
        
         
//            return minPath(0,0,m,n,arr);
//     }
    
    
    public int minPath(int i,int j, int m,int n,int arr[][],int dp[][]){
        
        
           if(i>=n ||  j>=m){
               return Integer.MAX_VALUE;
           }
        
        
           if(i==arr.length-1 &&  j==arr[0].length-1){
               return arr[i][j];
           }
        
          if(dp[i][j]!=-1){
              return dp[i][j];
          }
        
        
        
          return dp[i][j]= arr[i][j]+Math.min(minPath(i+1,j,m,n,arr,dp),minPath(i,j+1,m,n,arr,dp));
    }
    public int minPathSum(int[][] arr) {
        
        
          int n=arr.length;
          int m=arr[0].length;
        
         
            int dp[][]=new int[n+1][m+1];
                
             for(int nums[]:dp){
                 Arrays.fill(nums,-1);
             }
        
           return minPath(0,0,m,n,arr,dp);
    }
}