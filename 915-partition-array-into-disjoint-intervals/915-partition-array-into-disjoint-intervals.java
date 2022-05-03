class Solution {
    public int partitionDisjoint(int[] a) {
        
        int leftmax=a[0];
        int rightmax=a[0];
        
        int ans=0;
        
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>rightmax)
            {
                rightmax=a[i];
            }
            else if(leftmax>a[i])
            {
                leftmax=rightmax;
                ans=i;
            }
        }
        return ans+1;
    }
}