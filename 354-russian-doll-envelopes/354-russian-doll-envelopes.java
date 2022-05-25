class Solution {
    public int maxEnvelopes(int[][] envelopes) 
    {        
        Pair[] arr=new Pair[envelopes.length];
        
        for(int i=0;i<arr.length;i++){
            
            int[] nums=envelopes[i];
            int w=nums[0];
            int h=nums[1];
            
            Pair np=new Pair(w,h);
            
            arr[i]=np;
        }
          Arrays.sort(arr);
       
         return LIS(arr);
    }
    
    private int LIS(Pair[] arr){
        
          int ans=0;
        
          int[] minele=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
            
            int val=arr[i].h;
            int lo=0, hi=ans;
            
            while(lo<hi){
                int mid=(lo + hi)/2;
                if(minele[mid]<val){
                    lo=mid+1;
                }else{
                    hi=mid;
                }
            }
            minele[lo]=val;
            
            if(lo==ans){
                ans++;
            }
        }
        return ans;
    }
    
    public static class Pair implements Comparable<Pair>{
        int w;
        int h;
        
        Pair(int w,int h){
            this.w=w;
            this.h=h;
        }
        
        // @Override
        public int compareTo(Pair other){
            if(this.w==other.w) return other.h -this.h;
            return this.w-other.w;
        }
    }
}