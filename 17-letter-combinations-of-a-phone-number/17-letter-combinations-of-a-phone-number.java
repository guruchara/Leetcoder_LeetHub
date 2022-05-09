class Solution {
    public static String [] coder = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
    
    ArrayList<String>p=new ArrayList<String>();
    
    public List<String> letterCombinations(String s) {           
        if(s.equals(""))
        {
            return p;
        }
        else
        {
            return check(s);
        }
    }
        
        public static List<String> check(String s)
        {
          if(s.length()==0)
          {
              ArrayList<String>l=new ArrayList<String>();          
              l.add("");
              return l;
          }
            
        char ch=s.charAt(0);
        String x=s.substring(1);
        
        List<String> recAns =  check(x);
        ArrayList<String> myAns = new ArrayList<>();
        
        int idx=ch-'0';
        String k=coder[idx];
        
        for(int i=0;i<k.length();i++)
        {
            char newchar=k.charAt(i);
            for(String m:recAns)
            {
                myAns.add(newchar+m);
            }
        }           
            System.out.println(myAns.size());
         return myAns;        
    }
}