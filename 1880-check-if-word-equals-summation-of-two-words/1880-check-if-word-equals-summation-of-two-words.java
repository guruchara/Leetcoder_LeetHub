class Solution {
    public boolean isSumEqual(String first, String second, String target) {
        
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        
        for(int i=0;i<first.length();i++)
        {
            sb.append(first.charAt(i)-'a');
        }
        
        for(int i=0;i<second.length();i++)
        {
            sb1.append(second.charAt(i)-'a');
        }       
        
        int x=Integer.parseInt(sb.toString());
        int y=Integer.parseInt(sb1.toString());
                               
        for(int i=0;i<target.length();i++)
        {
            sb2.append(target.charAt(i)-'a');
        }
        int t=Integer.parseInt(sb2.toString());
        return t==(x+y);
    }
}