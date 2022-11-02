class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int n=nums.length;
        
        int c[]=new int[nums.length+1];
        
        for(int i=0;i<nums.length;i++)
        {
            c[nums[i]]++;
        }
        
        ArrayList<Integer>l=new ArrayList<Integer>();
        for(int i=1;i<nums.length+1;i++)
        {
            if(c[i]==0)
            {
                l.add(i);
            }
        }
        return l;
    }
}


