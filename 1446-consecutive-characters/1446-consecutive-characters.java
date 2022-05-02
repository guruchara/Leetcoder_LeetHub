class Solution {
    public int maxPower(String s) {
        
        int c=1;
        int max=1;
        for(int i=1;i<s.length();i++){
            
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            
            if(ch==ch1)
            {
                c++;
                if(c>max)
                {
                    max=c;                    
                }                
            }
            else
            {
                c=1;
            }            
        }
        return max;
    }
}