class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer>h=new HashSet<>();
        
        int max=0;
        
        for(int val:nums)
        {
            h.add(val);
            max=Math.max(val,max);
        }
         int i=1;
        while(i<max)
        {
            if(!h.contains(i))
            {
                return i;
            }
            i++;
        }
        return max+1;
    }
}