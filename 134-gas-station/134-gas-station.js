/**
 * @param {number[]} gas
 * @param {number[]} cost
 * @return {number}
 */
var canCompleteCircuit = function(gas, cost) {
    
     let csum=0
     let osum=0
     
     let si=0
     
     for(let i=0;i<gas.length;i++){
         
         osum+=(gas[i]-cost[i])
         csum+=(gas[i]-cost[i])
         
         if(csum<0){
           csum=0;
             si=i+1;
         }
     }
    
    if(osum>=0){
        return si
    }
    else
        {
            return -1
        }
};
