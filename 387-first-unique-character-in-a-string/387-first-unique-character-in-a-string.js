/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
     
//      const st=new Set();
    
//      let arr=[...s]
      
//      for(let x of arr){
//          st.add(x);
//      }
    
//     console.log(st)
    
    
//     const arrr=Array.from(st);
    
    
//     for(let i=0;i<arrr.length;i++){
//         let c=0;
//          for(let j=0;j<arr.length;j++){
//              if(arrr[i]==arr[j]){
//                  c++;
//              }
//              if(c==1){
//                  return j;
//              }
//          }

//     }
//     return -1;
    
    if (!s) return -1;
	if (s.length === 1) return 0;
    for (var i = 0; i < s.length; i++) {
        if (s.indexOf(s[i]) === s.lastIndexOf(s[i])) {
            return i;
        }
    }
    return -1;
};



