class Solution {
    public int numOfStrings(String[] x, String s) {
        
          int c=0;
        
         for(int i=0;i<x.length;i++)
         {
             if(s.contains(x[i]))
             {
                 c++;
             }
         }
        return c; 
    }
}