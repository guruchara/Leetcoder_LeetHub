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
        String x1=sb.toString();
        String x2=sb1.toString();
        
        int x=Integer.parseInt(x1);
        int y=Integer.parseInt(x2);
        
        int z=x+y;
       
        
        for(int i=0;i<target.length();i++)
        {
            sb2.append(target.charAt(i)-'a');
        }
        int t=Integer.parseInt(sb2.toString());
        return t==z;
    }
}