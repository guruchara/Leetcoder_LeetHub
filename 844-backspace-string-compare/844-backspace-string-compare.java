class Solution {
    public boolean backspaceCompare(String s, String t) {
        return func(s).equals(func(t));
    }
    String func(String s)
    {
        StringBuilder sb=new StringBuilder("");
        char[] w=s.toCharArray();
        for(int i=0;i<w.length;i++)
        {
            
            if(w[i]=='#')//stringBuilder needs to delete last char added to it
            {
                if(sb.length()==0)continue;//beacuse we can't delete -1th char
                sb.deleteCharAt(sb.length()-1);
            }
            else
                sb.append(w[i]);//just append 
        }
        return sb.toString();
    }
}