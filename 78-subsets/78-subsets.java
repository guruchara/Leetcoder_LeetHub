class Solution {
    // I created main List of list
    public List<List<Integer>>lm=new ArrayList<>();
    
    public void check(int nums[],ArrayList<Integer>l,int start)
    {
        if(start>=nums.length)
        {
            lm.add(new ArrayList<>(l));
            return;
        }
        
        check(nums,l,start+1);
        l.add(nums[start]);
        check(nums,l,start+1);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
    
         
         check(nums,new ArrayList<Integer>(),0);
         return lm;
    }
}