class Solution {
 
    
    public int [] nextsmallestleft(int a[])
    {
         Stack<Integer>st=new Stack<>();
         int n=a.length;
         int ans[]=new int[n];
        
        // Arrays.fill(ans,-1);
        
        for(int i=n-1;i>=0;i--)
        {
            while(st.size()!=0 && a[st.peek()]>a[i])
            {
                int  idx=st.pop();
                ans[idx]=i;
            }
            st.push(i);
        }
        
        while(st.size()!=0){
            int idx = st.pop();
            ans[idx] = -1;
        }
        
        return ans;
        
    }
    public int [] nextsmallestright(int a[])
    {
       Stack<Integer>st=new Stack<>();
        int n=a.length;
        
        int ans[]=new int[n];
        // Arrays.fill(ans,-1);
        
        for(int i=0;i<n;i++)
        {
            while(st.size()!=0 && a[st.peek()]>a[i])
            {
                int idx=st.pop();
                ans[idx]=i;
            }
            st.push(i);
        }
        
        while(st.size()!=0){
            int idx = st.pop();
            ans[idx] = a.length;
        }
        return ans;
    }
    public int Leetcode84(int[] a) {
                
        int nsol[]=nextsmallestleft(a);
        int nsor[]=nextsmallestright(a);
        
        int max=0;
        
        for(int i=0;i<a.length;i++)
        {
            int W=nsor[i]-nsol[i]-1;
            
            int area=W*a[i];
            max=Math.max(area,max);
        }
        return max;        
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        
        int[] heights = new int[matrix[0].length];
        int maxArea=-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                
                if(matrix[i][j]=='0'){
                    heights[j] = 0;
                } else {
                    heights[j] ++;
                }
            }            
            int area = Leetcode84(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}