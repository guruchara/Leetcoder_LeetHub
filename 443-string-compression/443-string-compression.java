class Solution {
    public int compress(char[] a) {
        

        StringBuilder sb=new StringBuilder();
        
        sb.append(a[0]);
        
        int c=1;
        for(int i=1;i<a.length;i++)
        {
            char cr=a[i];
            char pr=a[i-1];
            
            if(cr==pr)
            {
                c++;
            }
            else
            {
                if(c>1)
                {
                    sb.append(c);
                }
                c=1;
                sb.append(cr);
            }
        }
        if(c>1)
        {
            sb.append(c);
        }
        
        // String x=sb.toString();
        
        for(int i=0;i<sb.length();i++)
        {
            a[i]=sb.charAt(i);
        }
            
        return sb.length();
    }
}