/**
 * @param {string} s
 * @return {character}
 */
var repeatedCharacter = function(s) {
    
    const st=new Set();
    
   
        for(let i=0;i<s.length;i++){
        
             if(!st.has(s.charAt(i))){
                 st.add(s.charAt(i));
             }
            else
                {
                    return s.charAt(i);
                }
        }
};