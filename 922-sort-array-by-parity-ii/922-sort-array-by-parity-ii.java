class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int a[]=new int[nums.length];
        
        int i=0;
        for(int val:nums)
        {
            if(val%2==0)
            {
               a[i]=val;    
               i=i+2;
            }           
            
        }
        i=1;
        
        for(int val:nums)
        {
            if(val%2!=0)
            {
               a[i]=val;    
                i=i+2;
            }            
        }
        return a;
    }
}