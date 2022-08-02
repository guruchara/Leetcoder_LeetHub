class Solution {
    public int findDuplicate(int[] nums) {
     
          HashSet<Integer>h=new HashSet<>();
        
           for(int val:nums){
               if(h.contains(val)){
                   return val;
               }
               else
               {
                   h.add(val);
               }
           }
        return 0;
    }
}