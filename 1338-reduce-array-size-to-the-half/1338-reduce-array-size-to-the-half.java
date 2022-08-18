class Solution {
    public int minSetSize(int[] arr) {
        
        int n = arr.length;
        if(n==1 || n==2) return 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(Integer x: arr){
            hm.put(x,hm.getOrDefault(x, 0) + 1);
        }
        for(Integer x: hm.values()){
            pq.offer(x);
        }
        int res = 0;
        int count = 0;
        while(res < n/2 && pq.size() > 0) {
            res += pq.poll();
            count++;
        }
        return count;
    }
}