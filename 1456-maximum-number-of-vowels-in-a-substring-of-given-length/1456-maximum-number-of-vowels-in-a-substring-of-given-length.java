class Solution {
    public int maxVowels(String s, int k) {
                
       Set<Character>h=new HashSet<>();        
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        
        // count vowel
        int cv=0;  
        // max
        int max=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(h.contains(s.charAt(i)))
            {
                cv++;
            }
            
            if(i>=k&& h.contains(s.charAt(i-k)))
            {
                cv--;
            }
            
            max=Math.max(cv,max);
        }
        return max;
    }
}
/*
class Solution {
    public int check(String s,int k)
    {        
        
        System.out.println(s);
         if(s.length()>k)
          {
              return 0;
           }
         
             int c=0;
           for(int j=0;j<s.length();j++)
           {
               char ch=s.charAt(j);
               if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
               {
                   c++;
               }
            }
        return c;
    }
    public int maxVowels(String s, int k) {
        
         int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length()-k+1;i++)
        {
            // for(int j=i;j<s.length();j++)
            // {
                String x=s.substring(i,i+k);
                max=Math.max(max,check(x,k));
            // }
        }
        return max;
    }
}*/