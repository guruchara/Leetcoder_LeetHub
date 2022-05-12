class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       
        HashMap<Integer,Integer>hm1=new HashMap<>();
        HashMap<Integer,Integer>hm2=new HashMap<>();
        
        for(int val:nums1)
        {
            hm1.put(val,1);
        }
        
        for(int val:nums2)
        {
            hm2.put(val,1);
        }
        
        ArrayList<Integer>l1=new ArrayList<>();
        
        for(int x:hm1.keySet())
        {
            if(!hm2.containsKey(x))
            {
                l1.add(x);
            }
        }
        
        ArrayList<Integer>l2=new ArrayList<>();
        
        for(int x:hm2.keySet())
        {
            if(!hm1.containsKey(x))
            {
                l2.add(x);
            }
        }

         List<List<Integer>>lm=new ArrayList<>();
        lm.add(l1);
        lm.add(l2);
        
        return lm;
    }
}