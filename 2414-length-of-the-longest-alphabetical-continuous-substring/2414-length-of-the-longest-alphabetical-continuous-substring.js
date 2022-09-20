/**
 * @param {string} s
 * @return {number}
 */
var longestContinuousSubstring = function(s) {
    let count=1;
    
     let n=s.length;
     
    for(var i=0;i<n;i++){
        let curr=1
        while(i<n-1 && s.charCodeAt(i+1)-s.charCodeAt(i)===1){
              curr++;
              i++;
            
            count=Math.max(count,curr);
        } 
    }
    return count
}; 
