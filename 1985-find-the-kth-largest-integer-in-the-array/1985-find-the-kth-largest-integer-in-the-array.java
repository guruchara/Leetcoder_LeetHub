import java.util.*;
import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {

         PriorityQueue<BigInteger>pq=new PriorityQueue<>();
         
        for(int i=0;i<nums.length;i++)        
        {
             if(i<k)
             {
                pq.add(new BigInteger(nums[i]));     
             }            
            else
            {
                pq.add(new BigInteger(nums[i]));
                pq.poll();
            }
        }
        return String.valueOf(pq.peek());        
    }
}

