// class Solution {
//     public int[] frequencySort(int[] nums) {
                
        
//         HashMap<Integer,Integer>hm=new HashMap<>();
//          hm.put(nums[0],1);
        
//         for(int i=1;i<nums.length;i++)
//         {
//             if(!hm.containsKey(nums[i]))
//             {
//                 hm.put(nums[i],1);
//             }
//             else
//             {
//                 int c=hm.get(nums[i]);
//                 hm.put(nums[i],c+1);
//             }
//         }
        
//         PriorityQueue<Integer>pq=new PriorityQueue((a,b)->hm.get(a)-hm.get(b));
        
//         for(int val:hm.keySet())
//         {
//             pq.offer(val);
//         }
//         ArrayList<Integer>l=new ArrayList<Integer>();
        
//         while(pq.size()!=0)
//         {
//             Integer x=pq.poll();
            
//             for(int i=0;i<hm.get(x);i++)
//             {
//                 l.add(x);
//             }
//         }
        
//         int temp[]=new int[l.size()];
//         int j=0;
//         for(int val:l)
//         {
//             temp[j]=val;
//             j++;
//         }
//         return temp;
//     }
// }

class Solution {
    public int[] frequencySort(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele:  arr)
          map.put(ele,map.getOrDefault(ele,0)+1);
          
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a) != map.get(b))
              return map.get(a) - map.get(b);
            else
              return b - a;
        });
        
        for(Integer ele : map.keySet()){
            pq.add(ele);
        }
        int count = 0;
        int[] ans = new int[n];
        while(pq.size() != 0){
         int key = pq.remove();    
          for(int i=0;i<map.get(key);i++)
            ans[count++] = key;
        }
        return ans;
    }
}