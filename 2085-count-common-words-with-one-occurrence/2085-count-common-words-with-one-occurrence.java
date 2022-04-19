class Solution {
    public int countWords(String[] a, String[] b) {
        
        HashMap<String,Integer>hm=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            else
            {
                int c=hm.get(a[i]);
                hm.put(a[i],c+1);
            }            
        }
        
       HashMap<String,Integer>hm1=new HashMap<>();
        for(int i=0;i<b.length;i++)
        {
            if(!hm1.containsKey(b[i]))
            {
                hm1.put(b[i],1);
            }
            else
            {
                int c=hm1.get(b[i]);
                hm1.put(b[i],c+1);
            }      
        }
        
        int c=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.get(a[i])==hm1.get(a[i]) && hm.get(a[i])==1)
            {
                c++;
            }
        }
        return c;
    }
}