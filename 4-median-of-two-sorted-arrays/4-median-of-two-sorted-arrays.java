class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
         ArrayList<Integer>l=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            l.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            l.add(nums2[i]);
        }
        
        Collections.sort(l);
        
        if(l.size()%2!=0)
        {
            // System.out.println(l.get(l.size()/2)/1.0);
            return l.get(l.size()/2)/1.0;
        }
        else
        {
            double x=l.get((l.size()/2)-1);
            double y=l.get(l.size()/2);
            
            return (x+y)/2.0;
        }
    }
}