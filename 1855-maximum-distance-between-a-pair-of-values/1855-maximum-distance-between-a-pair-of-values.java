class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int max=0;
        
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++)
        //     {
        //         if(nums2[j]>=nums1[i]&&i<=j )
        //         {
        //             int x=j-i;
        //             System.out.print(x +" ");
        //             max=Math.max(x,max);
        //         }
        //     }
        // }
        
        int res = 0, i = 0, n =nums1.length, m = nums2.length;
        
        for (int j = 0; j < m; ++j) {
            while (i < n && nums1[i] > nums2[j])
                i++;
            if (i == n) break;
            res = Math.max(res, j - i);
        }
        return res;
    }
}