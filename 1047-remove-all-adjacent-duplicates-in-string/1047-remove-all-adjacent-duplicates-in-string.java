class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character>st=new Stack<Character>();        
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            // yha pr phle isEmpty likhna pdega otherwise empty stakc error aayegi
            if(!st.isEmpty()&& st.peek()==ch)
            { 
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        
        StringBuffer sb=new StringBuffer();
        while(st.size()!=0)
        {
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
        
    }
}

