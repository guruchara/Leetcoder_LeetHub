// var breakPalindrome = function(s) {
    
//      if(s.length==1){
//       return ""
//      }
    
//   let  arr=s.split("\+").join(",")
    
//     for(let i=0;i<s.length/2;i++){
        
//          if(arr[i]!=='a'){
//              arr[i]='a'
//              return new String(arr)
//          }
//     }
//     arr[s.length-1]='b'
//     return new String(arr)
// };

class Solution {
    public String breakPalindrome(String s) {
        
        int l = s.length();
        
        if(l==1) return "";
        
        char[] c = s.toCharArray();
        
        
        
        
        for(int i=0;i<l/2;i++){
            
            if(c[i]!='a'){
                c[i]='a';
                return new String(c);
            }
        }
        c[l-1] = 'b';
        return new String(c);
    }
}