class Solution {
    public List<Integer> majorityElement(int[] nums) {
        LinkedHashSet<Integer>h=new LinkedHashSet<>();
        for(int val:nums)
        {
            h.add(val);
        }
        // if(h.size()==nums.length)
        // {
        //     ArrayList<Integer>l=new ArrayList<>(h);
        //     return l;
        // }
        int max=0;
        int ele=0;
        ArrayList<Integer>lx=new ArrayList<>();
        for(int val:h)
        {
            int c=0;
            for(int i=0;i<nums.length;i++)
            {
                if(val==nums[i])
                {
                    c++;
                }
            }
            if(c>nums.length/3)
            {
                lx.add(val);                
            }
        }        
        return lx;
        
    }
}