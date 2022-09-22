class Solution {
    
    public String reverse(String s){
        StringBuffer sb=new StringBuffer();
        sb.append(s);
        sb.reverse();
        return sb.toString();
        
    }
    public String reverseWords(String s) {
        
         String x="";
        
         s=s.trim();
         String arr[]=s.split(" ");
 
         for(int i=0;i<arr.length;i++){
             x+=reverse(arr[i]);
             
             if(i<arr.length-1){
                 x+=" ";
             }
         }
        return x;
    }
}