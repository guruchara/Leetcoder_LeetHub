/**
 * @param {string[]} word1
 * @param {string[]} word2
 * @return {boolean}
 */
var arrayStringsAreEqual = function(s1, s2) {
    
       let s=''
       
       s1.forEach((x)=>{
           s+=x;
       })
    
    if(s2.length===1){
        return s===s2[0].toString()
    }
    let s3=''
    
    s2.forEach((x)=>{
        s3+=x
    })
    
    return s===s3
};