class Solution 
{
    public int longestValidParentheses(String s)         
    {
        
        if(s.length()==0)
        {
            return 0;
        }
        int x=0;
        
       Stack<Integer>st=new Stack<>();

        st.push(-1);
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(ch=='(')
            {
                st.push(i);
            }
            else
            {
               st.pop();
                      
              if(st.isEmpty())
              {
                  st.push(i);
              }
              else
              { 
                 x=Math.max(x,i-st.peek());
              }
            }
        }
        return x;
    }
}


