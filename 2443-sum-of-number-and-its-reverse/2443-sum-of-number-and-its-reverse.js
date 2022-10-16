/**
 * @param {number} num
 * @return {boolean}
 */
var sumOfNumberAndReverse = function(num) {
         if(num===0) return true; 
         
        let n=num; 
         
        for(let i=1; i<=n; i++){ 
             
            let j=0; 
            var temp=i; 
            while(temp>0){ 
                
                 digit=temp%10; 
                temp= parseInt(temp/10); 
                 
                j=j*10+digit; 
            } 
            
            if((i+j)===num){ 
                return true; 
            } 
             
        } 
        return false; 
};