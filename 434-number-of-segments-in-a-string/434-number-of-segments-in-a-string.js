/**
 * @param {string} s
 * @return {number}
 */
var countSegments = function(s) {
  
    
      let x=s.split(" ")
      
      let c=0;
    
      for(let i=0;i<x.length;i++){
           
          if(x[i]!=""){
              c++;
          }          
      }
     return c;
};