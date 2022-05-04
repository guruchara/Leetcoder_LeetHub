class Solution {
    public String frequencySort(String s) {
     
        HashMap<Character,Integer>hm=new HashMap<>();
        
        for(char ch:s.toCharArray())
        {
           if(!hm.containsKey(ch))
           {
               hm.put(ch,1);
           }
            else
            {
                int c=hm.get(ch);
                hm.put(ch,c+1);
            }
        }
        
        PriorityQueue<Character>pq=new PriorityQueue((a,b)->hm.get(b)-hm.get(a));
        
        for(char ch:hm.keySet())
        {
            pq.offer(ch);
        }
        StringBuffer sb=new StringBuffer();
        
        while(pq.size()!=0)
        {
            char chh=pq.poll();
            
            for(int i=0;i<hm.get(chh);i++)
            {
                sb.append(chh);
            }
        }
        return sb.toString();
    }
}


 