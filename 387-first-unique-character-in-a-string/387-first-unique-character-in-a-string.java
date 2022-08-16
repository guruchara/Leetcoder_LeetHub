class Solution {
    public int firstUniqChar(String s) {
         
        LinkedHashSet<Character>h=new LinkedHashSet<Character>();
        
        for(int i=0;i<s.length();i++)
        {
           h.add(s.charAt(i));
        }
        
         for(Character val:h)
         {
             int c=0;
             int j=-1;
              for(int i=0;i<s.length();i++)
              {
                  if(val==s.charAt(i))
                  {
                      c++;
                      j=i;
                  }                  
              } 
                if(c==1)
                  {
                      return j;
                  }
         }
        return -1;
    }
}