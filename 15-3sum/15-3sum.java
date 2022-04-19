class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threeSumSet  = new HashSet<>();
        
        Arrays.sort(nums);
        
        // length-2  bcz hme kvl three elemenet ka sum check krna he 
        for(int i=0; i<nums.length-2;i++){ 
            int j =i+1;
            
            int k = nums.length-1;
            
            // kabhi hm cross kr denge to loop se bahar jayenege
            while(j<k){
                
                int sum = nums[i]+nums[j]+nums[k];

            // if sum is equal to 0 then j increment or k ko decrement krenge and i to vese bhi increment ho jayega 
                
                if(sum==0){
                    threeSumSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    
                    j++;
                    k--;
                }
           // sum jyada hota  tb k ko km krenege kuyki hme ek bar k vale pe sum==0 mil chuka
                else if (sum > 0){
                    k--;
                } 
                
                // in this case only move the j 
                else if (sum < 0){
                    j++;
                } 
            }

        }
        
        return new ArrayList<>(threeSumSet);
    }
}
