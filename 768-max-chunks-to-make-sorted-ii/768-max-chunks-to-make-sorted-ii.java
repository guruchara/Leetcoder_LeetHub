class Solution {
    public int maxChunksToSorted(int[] arr) {
     
         int sum1=0;
        int sum2=0;
        
        int c=0;
        
        
        // temp Array  of main duplicate or cloning array 
        
        // copy of given array 
        
         int temp[]=arr.clone();
        // Sorted the array
        Arrays.sort(temp);
        
        for(int i=0;i<arr.length;i++)
        {
            sum1+=arr[i];
            sum2+=temp[i];
            
            if(sum1==sum2)
            {
                c++;
            }
        }
        return c;
    }
}