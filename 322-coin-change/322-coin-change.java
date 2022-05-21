class Solution {
    public int coinChange(int[] coins, int amount) {
                
        if(amount==0)            
        {
            return 0;
        }
        
        return helper(coins,amount,new int[10000]);
    }
    
    public static int helper(int[] nums , int amount , int[] vis){
    
        if(amount==0)
        { 
            return 0;
        }
        
        if(amount<0)
            return -1;
        
        if(vis[amount]!=0)
            return vis[amount];
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){ 
            
             int count = helper(nums,amount-nums[i],vis);
            
               if(count>=0){
                   min = Math.min(min,count+1);
               }
          }
        
        vis[amount]=min==Integer.MAX_VALUE?-1:min;
        
        return vis[amount];
    }
}