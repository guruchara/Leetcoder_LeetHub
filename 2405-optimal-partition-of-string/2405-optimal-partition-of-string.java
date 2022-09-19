class Solution {
    public int partitionString(String s) {
        
          int count =1;
          Set<Character>h=new HashSet<>();
        
           
           for(int i=0;i<s.length();i++){
               
               Character ch=s.charAt(i);
               
               if(h.contains(ch)){
                   
                 
                   count++;
                   h.clear();
                   h.add(ch);
               
           }
             
                   h.add(ch);
           }
        
        return count;
        
    }
}

		