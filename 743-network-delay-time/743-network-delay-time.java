class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for(int it[] : times){
            List<int[]> curr = map.getOrDefault(it[0], new ArrayList<int[]>());
            curr.add(new int[]{it[1], it[2]});
            map.put(it[0], curr);
        }
        
        int[] result = new int[n+1];
        Arrays.fill(result, Integer.MIN_VALUE);
        result[0] = 0;
        int res = -1;
                                                
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k, 0});
        while(! pq.isEmpty()){
            int[] curr = pq.poll();
            if(result[curr[0]] != Integer.MIN_VALUE) continue;
            
            result[curr[0]] = curr[1];
            
            List<int[]> al = new ArrayList<>();
            if(map.containsKey(curr[0])) {
                al = map.get(curr[0]);
            }
            for(int it[] : al){
                pq.add(new int[]{it[0], it[1]+curr[1]});
            }
        }
                                                
        
        for(int it = 1; it<result.length; it++){
            if(result[it] == Integer.MIN_VALUE) return -1;
            res = Math.max(result[it], res);
        }        
        return res;
    }
    
}