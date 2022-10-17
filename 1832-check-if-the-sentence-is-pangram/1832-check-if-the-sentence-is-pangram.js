/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(s) {
                
      const st=new Set();
     
      for(let i=0;i<s.length;i++){
          st.add(s.charCodeAt(i))
      }
    
    return st.size===26
};