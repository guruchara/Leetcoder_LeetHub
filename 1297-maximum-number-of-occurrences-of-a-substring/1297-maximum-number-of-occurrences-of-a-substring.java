// class Solution {
//     public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
//         HashMap<String,Integer>hm=new HashMap<>();
        
        
//            int c=0;
        
//            for(int i=0;i<s.length();i++){
//                for(int j=i;j<s.length();j++){
                   
//                    String x=s.substring(i,j+1);
                       
//                       HashSet<Character>h=new HashSet<>();
                    
//                     if(s.length()>=minSize && s.length()<=maxSize)
//                     {
//                           for(Character ch:x.toCharArray())
//                       {
//                           h.add(ch);
//                       }
                        
//                     }
                    
                   
//                    if(s.length()-h.size()<=2){
//                        c++;
//                    }
//                }
//            }
//         return c;
//     }
// }


class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        
        if(s == null || s.length() == 0 || maxLetters == 0) return 0;
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        int max = 0;
        for(int i = 0; i < s.length() - minSize + 1; i++) {
            
            String cur = s.substring(i, i + minSize);
            if(isValid(cur, maxLetters)) {
                
                hm.put(cur, hm.getOrDefault(cur, 0) + 1);
                
                max = Math.max(max, hm.get(cur));
            }
        }
        return max;
    }
	
    boolean isValid(String cur, int maxLetters) {
        HashSet<Character> hs = new HashSet<>();
        for(char c: cur.toCharArray()) hs.add(c);
        return hs.size() <= maxLetters;
    }
}