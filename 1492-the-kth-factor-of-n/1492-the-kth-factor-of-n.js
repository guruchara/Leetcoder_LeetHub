/**
 * @param {number} n
 * @param {number} k
 * @return {number}
 */
var kthFactor = function(n, k) {
    
    let arr=[] 
    let x=0;
     for(let i=1;i<=n;i++){
         if(n%i===0){
           arr[x++]=i
         } 
     }
    return k>arr.length?-1:arr[k-1]
};