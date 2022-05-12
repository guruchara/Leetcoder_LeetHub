class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
      
            for(int num[]:nums)
            {
                for(int val:num)
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
            }
                         
        
        List<Integer>l=new ArrayList<>();
        
         for(int x:hm.keySet())
         {
             if(hm.get(x)==nums.length)
             {
                 l.add(x);
             }
         }
        Collections.sort(l);
        return l;
    }
}