class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int t[]=new int[n];
        int f=0;
        int l=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                t[f]=nums[i];
                f++;
            }
            else
            {
                t[l]=nums[i];
                l--;
            }
        }
        return t;
    }
}