// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
       
//         PriorityQueue<Integer>q=new PriorityQueue<>(Collections.reverseOrder());
        
//         int i=0;
//         int n=nums.length;
//         ArrayList<Integer>res=new ArrayList<>();
        
//         for(;i<k;i++)
//         {
//             q.add(nums[i]);
//         }
        
//         res.add(q.peek());
        
//         q.remove(nums[0]);
        
//         // iterate  loop for next elements 
        
//         for(;i<n;i++)
//         {
//             q.add(nums[i]);
            
//             res.add(q.peek());
            
//             q.remove(nums[i-k+1]);
//         }
        
//         int a[]=new int[res.size()];
        
//         int p=0;
//         for(int val:res)
//         {
//             a[p++]=val;
//         }
//         return a;
//     }
// }


class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        int len = nums.length;
        if (len == 0 || k == 1) {
            return Arrays.copyOf(nums, len);
        }
        if (len <= k) {
            return new int[] { getMaxVal(nums) };
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[len - k + 1];

        for (int i = 0; i < len; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    private int getMaxVal(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            max = Math.max(max, n);
        }
        return max;
    }
}