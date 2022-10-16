/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxK = function(nums) {
    
    
     const st=new Set();
    
    nums.forEach((val)=>{
        st.add(val)        
    })
    
    let ans=-1
    
    nums.forEach((x)=>{
        if(x>0 && st.has(-x))
            {
                ans=Math.max(ans,x)
            }
    })
     return ans;             
};

