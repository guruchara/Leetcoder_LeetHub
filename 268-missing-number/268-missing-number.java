class Solution {
    public int missingNumber(int[] nums) {
        
         Arrays.sort(nums);
        
        int x=0;
        
        for(int val:nums)
        {
            if(val==x)
            {
                x++;
            }
            else
            {
                return x;
            }
        }
        return x;
    }
}