class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        
        HashMap<String,Integer>hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                int c=hm.get(nums[i]);
                hm.put(nums[i],c+1);
            }
        }
        
//         PriorityQueue<String>pq=new PriorityQueue((a,b)->hm.get(a)-hm.get(b));
PriorityQueue<String> pq= new PriorityQueue<>((a, b) ->hm.get(a).equals(hm.get(b)) ?
                b.compareTo(a) :hm.get(a) -hm.get(b));
        
        ArrayList<String>l=new ArrayList<>();
        for(String word:hm.keySet())
        {
            pq.offer(word);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }                
                         
        while(pq.size()!=0)
        {
            l.add(pq.poll());
        }
        
        Collections.reverse(l);
        return l;
    }
}
