class Solution {
    public int findClosestNumber(int[] nums) {
        
        int Min=Integer.MAX_VALUE;
        
        for(int val:nums)
        {
            if(Math.abs(val)<Math.abs(Min) || val==Math.abs(Min))
            {
                Min=val;
            }
        }
        return Min;
    }
}