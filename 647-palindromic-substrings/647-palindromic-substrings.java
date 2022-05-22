class Solution {
    public int countSubstrings(String s) {
         
                 int c=0;
           for(int i=0;i<s.length();i++)
           {
              for(int j=i;j<s.length();j++)
              {
                  String g=s.substring(i,j+1);
                   if(check(g))
                   {
                       c++;
                   }
              }
           }
        return c;
    }
        public static boolean check(String s)
          {
                 int i=0;
                 int j=s.length()-1;

                 while(i<=j)
                 {
                      char ch=s.charAt(i);
                      char lc=s.charAt(j);
                     if(ch!=lc)
                     {
                        return false;
                     }
                     i++;
                     j--;
                 }
                return true;
            }                              
}