/**
 * @param {string[]} dictionary
 * @param {string} sentence
 * @return {string}
 */
// var replaceWords = function(arr, s) {
    
//        const st=new Set();
     
//        for(let x of arr){
//            st.add(x);
//        }
    
//     let word=s.split(" ")
    
//     var bff = new StringBuffer()
    
//     for(let p of word){
        
//     let str=""
    
//     for(let i=1;i<s.length;i++){
         
//         str=p.substring(0,i)
        
//         if(st.has(str)){
//             break
//         }
//     }
//         bff.concat(str+ " ")
//     }
//       return bff.substring(0,bff.length-1).toString()
// };

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> st = new HashSet<>();
        
        for(String s : dictionary) st.add(s);
        
        String[] word = sentence.split(" ");
        
        StringBuffer res = new StringBuffer();
        
        for(String s : word){
            String curr = "";
            for(int i =1;i<=s.length();i++){
                curr = s.substring(0,i);
                if(st.contains(curr)) break;
            }
            res.append(curr+" ");
        }
        return res.substring(0,res.length()-1).toString();  //to remove the last added whitespace
    }
}