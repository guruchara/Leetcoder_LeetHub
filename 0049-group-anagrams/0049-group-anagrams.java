// class Solution
//     {
//         public List<List<String>> groupAnagrams(String[] a) {                          
            
//            List<List<String>>lm=new ArrayList<>();
            
//          for(int i=0;i<a.length;i++)
//          {
//              ArrayList<String>l=new ArrayList<>();
             
//              for(int j=i;j<a.length;j++)
//              {
//                  char x[]=a[i].toCharArray();
//                  Arrays.sort(x);
//                  String y=new String(x);
                 
//                  char pp[]=a[j].toCharArray();
//                  Arrays.sort(pp);
//                  String m=new String(pp);
                 
//                  if(y.equals(m))
//                  {                     
//                      l.add(m);                     
//                  }
//              }
//              lm.add(l);
//          }  
//             return lm;
//     }
// }
class Solution {
    
    public List<List<String>> groupAnagrams(String[] a) 
    {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            
            String s1=a[i];
            
            char[] arr=s1.toCharArray();
            
            Arrays.sort(arr);
            
            String str=new String(arr);
            
            if(map.containsKey(str)){
                map.get(str).add(s1); 
                
            }
            else
             {                
                map.put(str,new ArrayList<>());
                
                map.get(str).add(s1);
            }
        }
        return new ArrayList<>(map.values());
    }
}