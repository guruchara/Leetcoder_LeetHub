class Solution 
{
    
    public String arrangeWords(String s) {
        
        String temp=s.toLowerCase();
        
        String arr[]=temp.split("\\s");
        
        Arrays.sort(arr,(a,b)->a.length()-b.length());
        
        String res=String.join(" ",arr);
     
          return Character.toUpperCase(res.charAt(0)) + res.substring(1);
        // return Character.toUpperCase(res.charAt(0))+res.substring(1);
    }
}

    