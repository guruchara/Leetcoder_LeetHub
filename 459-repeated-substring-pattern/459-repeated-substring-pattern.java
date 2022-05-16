class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        
          
//         HashMap<String,Integer>hm=new HashMap<>();
        
//         for(int i=0;i<s.length();i++)
//         {
//             for(int j=i;j<s.length();j++)
//             {
//                 String x=s.substring(i,j+1);
//             System.out.println(x);       
//                 if(!hm.containsKey(x))
//                 {
//                     hm.put(x,1);
//                 }
//                 else
//                 {
//                     int c=hm.get(x);
//                     hm.put(x,c+1);
//                 }
//             }            
//         }        
        
//         for(String k:hm.keySet())
//         {            
//             if(hm.get(k)>=2)
//             {
//                 return true;
//             }
//         }
//         return false;
        
        String x1=s+s;
        
        String x2=x1.substring(1,x1.length()-1);
        
        if(x2.contains(s))
            return true;
        return false;
    }
}