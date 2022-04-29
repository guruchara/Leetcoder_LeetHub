class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        HashSet<Integer>h=new LinkedHashSet<Integer>();
        for(int val:nums)
        {
            h.add(val);
        }
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                int c=hm.get(nums[i]);
                hm.put(nums[i],c+1);
            }
        }
        
        for(int val:h)
        {
            if(hm.get(val)==1)
            {
                return val;
            }
        }
        return -1;
    }
}
