class Solution {
    
    public List<List<Integer>>lm=new ArrayList<>();
    
    public void check(int nums[],ArrayList<Integer>l,int idx)
    {
        if(idx>=nums.length)
        {
           lm.add(new ArrayList<>(l));
           return;
        }
        
        // not include then simply increment the index         
        check(nums,l,idx+1);
        l.add(nums[idx]);
        check(nums,l,idx+1);
        l.remove(l.size()-1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
        Arrays.sort(nums);
        check(nums,new ArrayList<Integer>(),0);
        
        HashSet<List>h=new HashSet<>();
        
        for(List x:lm)
        {
            h.add(x);
        }
        
         List<List<Integer>>lx=new ArrayList<>();
        
        for(List t:h)
        {
            lx.add(t);
        }
        System.out.println(h);
        return lx;
    }
}

