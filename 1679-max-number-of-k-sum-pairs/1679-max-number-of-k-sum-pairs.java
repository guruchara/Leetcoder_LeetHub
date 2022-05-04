class Solution {
    public int maxOperations(int[] nums, int k) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();

        
        int c=0;
        
        for(int val:nums)
        {
            if(hm.containsKey(val) && hm.get(val)>0)
            {
                c++;
                hm.put(val,hm.get(val)-1);
            }
            else
            {
                hm.put(k-val,hm.getOrDefault(k-val,0)+1);
            }
        }
        return c;
    }
}

