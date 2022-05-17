class Solution {
    public int[] minOperations(String boxes) {
        
        int[] res = new int[boxes.length()];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0;i<boxes.length();i++) if(boxes.charAt(i) == '1') list.add(i);
        
        for(int i=0;i<res.length;i++)
            for(int idx:list) 
                res[i] += Math.abs(idx - i);
                return res;
    }
}