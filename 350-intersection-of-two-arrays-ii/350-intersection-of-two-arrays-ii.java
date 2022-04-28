class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
         HashMap<Integer,Integer>hm=new HashMap<>();
        
         for(int i=0;i<nums1.length;i++)
         {
             if(!hm.containsKey(nums1[i]))
             {
                 hm.put(nums1[i],1);
             }
             else
             {
                 int c=hm.get(nums1[i]);
                 hm.put(nums1[i],c+1);
             }
         }
        ArrayList<Integer>l=new ArrayList<Integer>();
        
        for(int i=0;i<nums2.length;i++)
        {
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0)
            {
                l.add(nums2[i]);
                int x=hm.get(nums2[i]);                
                hm.put(nums2[i],x-1);
            }
        }
        int a[]=new int[l.size()];
        int i=0;
        
        for(int val:l)
        {
            a[i++]=val;
        }
        return a;
    }
}