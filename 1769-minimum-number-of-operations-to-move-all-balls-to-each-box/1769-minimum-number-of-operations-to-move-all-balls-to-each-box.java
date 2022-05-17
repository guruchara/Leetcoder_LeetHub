class Solution {
    public int[] minOperations(String boxes) {
        int len=boxes.length();
        int arr[]=new int[len];
        
        for(int i=0;i<arr.length;i++){
        
            for(int j=0;j<arr.length;j++){
                if(boxes.charAt(j)=='1'){
                    arr[i]+=Math.abs(i-j);
                }
            }
        
        }
        return arr;
    }
}