class Solution {
    public String reverseVowels(String s) {
        
        Stack<Character>st=new Stack<>();
        
         
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                st.push(s.charAt(i));                
            }

        }
        
        
        StringBuffer sb=new StringBuffer();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
                 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                 {
                     sb.append(st.pop());
                 }
            else
            {
                sb.append(ch);
            }
        }                     
        return sb.toString();
    }
}