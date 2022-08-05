class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        return permutations(nums, target,new Integer[target+1]);
        
    }
    
    public int permutations(int[] nums, int target,Integer dp[]){
        
        if(target == 0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        
        if(dp[target]!=null){
            return dp[target];
        }
        
        int count = 0 ;
        for(int i=0; i<nums.length; i++){
           count+= permutations(nums, target-nums[i],dp);
        }
        return dp[target]=count;
        // return count;
    }
}