class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        
        int si=0;
        int ei=0;
        
        int c=0;
        int prevc=0;
        
        int n=nums.length;
        
        while(ei<n)
        {
            if(left<=nums[ei] && nums[ei]<=right)
            {
                 prevc=ei-si+1;
                 c+=prevc;
            }
            else if(left>nums[ei])
            {
                c+=prevc;
            }
            else
            {
                si=ei+1;
                prevc=0;
            }
            ei++;
        }
        return c;
    }
}