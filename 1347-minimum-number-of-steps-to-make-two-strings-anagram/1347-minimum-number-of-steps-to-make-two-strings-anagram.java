class Solution {
    public int minSteps(String s, String t) {
        
         int arr[]=new int[26];
        
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        
        for(char ch:t.toCharArray()){
            arr[ch-'a']--;
        }
        
        
        int x=0;
        
        for(int i=0;i<arr.length;i++){
        
             if(arr[i]>0){
                 x+=arr[i];
             }
        }
        return x;
         
    }
}

