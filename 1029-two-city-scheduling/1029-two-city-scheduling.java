class Solution {
    public int twoCitySchedCost(int[][] mat) {
        
        
        Arrays.sort(mat,(a,b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        
            int sum=0;
       for(int i=0;i<mat.length;i++){
           
           if(i<mat.length/2){
               sum+=mat[i][0];
           }
           else
           {
               sum+=mat[i][1];
           }
       }      
        return sum;
    }    
}