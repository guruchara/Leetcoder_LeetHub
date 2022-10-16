var countDistinctIntegers = function(nums) {
        
    let arr=[]
    
    nums.forEach((val)=>{
         let str=val.toString().split('')
         
          for(let j=0;j<str.length;j++){
            arr.push(parseInt(str.reverse().join('')))
          }
    })

    return new Set(nums.concat((arr))).size         
};