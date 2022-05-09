class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        // creating dp array
        int t[] = new int[n];
        Arrays.fill(t, 1);  // every number in itself is a LIS of length 1
        
        // O(n_square) solution
        // t[i] -> is the length of LIS till i
        for(int i = 1; i < n; i++) {
            // simply iterating over array till 'i', and updating 't' array
            for(int j = 0; j < i ; j++) {
                if(nums[j] < nums[i]) {
                    t[i] = Math.max(t[i], t[j] + 1);
                }
            }
        }
        
        // finding maximum in the dp array 't'
        int LIS_length = 0;
        for(int v : t) {
           if(v > LIS_length) {
               LIS_length = v;
           }
        }
        return LIS_length;
    }
}