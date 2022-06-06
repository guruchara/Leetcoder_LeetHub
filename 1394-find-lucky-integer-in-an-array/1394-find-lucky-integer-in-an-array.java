class Solution {
    
    public int findLucky(int[] arr) {
        
         HashMap<Integer,Integer>hm=new HashMap<>();
        
         for(int val:arr)
         {
             if(!hm.containsKey(val))
             {
                 hm.put(val,1);
             }
             else
             {
                 int c=hm.get(val);
                 hm.put(val,c+1);
             }
         }
        
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(hm.get(arr[i])==arr[i])
            {
                max=Math.max(arr[i],max);
            }
        }
        return max;
    }
}