class Solution {
    public int repeatedStringMatch(String A, String B) {
        
         StringBuilder sb=new StringBuilder();
        
        for(int i=1;i<=B.length()&&sb.length()<=10000;i++){
            
            sb.append(A);
            
            if(sb.toString().contains(B))
                return i;
        }
        return -1;
    }
}