class Solution {
    public boolean find132pattern(int[] nums) {
        
        int mina[]=new int[nums.length];
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            mina[i]=min;
        }
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=nums.length-1;i>=0;i--)
        {
            while(st.size()>0 && st.peek()<=mina[i])
            {
                st.pop();
            }
            
            if(st.size()>0 && st.peek()<nums[i])
            {
                return true;
            }
            st.push(nums[i]);
        }
        return false;
        
    }
}

