class Solution {
    public int maxProduct(int[] A) {
        if(A==null || A.length==0)
        return 0;
        int maxLocal = A[0];
        int minLocal = A[0];
        int global = A[0];
        
        
        for(int i=1; i<A.length; i++){
        int temp = maxLocal;
            
        maxLocal = Math.max(Math.max(A[i]*maxLocal, A[i]), A[i]*minLocal);
            
        minLocal = Math.min(Math.min(A[i]*temp, A[i]), A[i]*minLocal);
            
        global = Math.max(global, maxLocal);
}
return global;
    }
}