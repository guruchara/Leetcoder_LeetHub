class Solution{
    public int trap(int[] height) {
        int n = height.length;
        
        int leftMax = 0, rightMax = 0, ans = 0, start = 0, end = n-1;
        
        while(start<end){
            
            if(height[start]<=height[end]){
                
                if(height[start]>leftMax) 
                    
                    leftMax = height[start];
                else  
                    ans += leftMax - height[start];
                
                start++;
            }
            else{
                if(height[end]>rightMax) 
                    rightMax = height[end];
                else  
                    ans += rightMax - height[end];
                
                end--;
            }
        }
        
        
        return ans;
    }
}