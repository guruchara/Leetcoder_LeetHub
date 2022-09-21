/**
 * @param {number[]} plants
 * @param {number} capacity
 * @return {number}
 */
var wateringPlants = function(plants, capacity) {
    
     let ans=0
     
     let tmp=capacity
     
     for(let i=0;i<plants.length;i++){
         
           if(plants[i]>tmp){
               ans+=(2*i)
               
               tmp=capacity
           }
         ans+=1
         tmp-=plants[i]
     }
    return ans;
};


