// class Solution 
// {
//     public int countHomogenous(String s) {
        
//           int c=0;
        
//          for(int i=0;i<s.length();i++)
//          {
//              for(int j=i;j<s.length();j++)
//              {
//                  String ss=s.substring(i,j+1);
                 
//                  StringBuffer sb=new StringBuffer();
//                  sb.append(ss);
//                  sb.reverse();
//                  String x=sb.toString();
                 
//                  if(x.equals(ss))
//                  {
//                      c++;
//                  }
//              }
//          }
//         return c;
//     }
// }
class Solution
{
public int countHomogenous(String s) 
{
    int count = 0, res = 0;
    
    for (int i = 0; i < s.length(); ++i) 
    {        
        if (i > 0 && s.charAt(i - 1) == s.charAt(i))
        {
            ++count;
        }
        else
        {
            count = 1;
        }
        res = (res + count) % 1000000007;
    }
    return res;
}
}