class Solution {
    public int[] sumZero(int n) {
        
        // Find the rule
        // A[i] = i * 2 - n + 1
        
        // Example Like : 
        // for n=2;
        //  1<2  when 2<2 condition false return or exit from the loop 
        //  a[0]=0*2-2+1=> a[0]=-1;
        //  a[1]=1*2-2+1 => a[1]=2-1=> a[1]=1
        
         int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
           a[i]=i*2-n+1;
        }
        return a;
    }
}