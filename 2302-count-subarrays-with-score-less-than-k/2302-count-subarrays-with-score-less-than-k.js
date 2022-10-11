/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countSubarrays = function(nums, k) {
     let sum = 0, count = 0;
        let i = 0, j = 0;
        
        while(i < nums.length) {
            sum += nums[i];

            while(sum* (i - j + 1) >= k) 
                sum -= nums[j++];
            
            count += (i++ - j + 1);
        }
        
        return count;
};