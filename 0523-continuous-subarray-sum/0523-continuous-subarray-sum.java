class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        
        Set<Integer> st =new HashSet();
        
        
        int currSum = 0, prevSum=0; 	
        
        
        
        
        for(int val: nums) {
            
            currSum += val;
            
            if(st.contains(currSum%k)) {
                return true;
            }
             currSum %=k;
            st.add(prevSum);
            prevSum = currSum;
        }
        return false;
    }
}