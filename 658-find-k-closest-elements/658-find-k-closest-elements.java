// class Solution {
    
//     class pair
//     {
//         int key;
//         int value;
        
//         pair(int key,int value)
//         {
//             this.key=key;
//             this.value=value;
//         }        
//     }
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {        
        
          
//         int n=arr.length;
        
//         List<Integer>l=new ArrayList<>();
        
//         // max heap
//         PriorityQueue<pair>pq=new PriorityQueue<>(new Comparator<pair>()
//                                                   {
//                                                       public int compare(pair a,pair b)
//                                                       {
//                                                           if((b.key-a.key)==0)
//                                                           {
//                                                               return b.value-a.value;
//                                                           }
//                                                           else
//                                                           {
//                                                               return b.key-a.key;
//                                                           }
//                                                       }
//                                                   });
        
//         for(int val:arr)
//         {
//             pq.add(new pair(Math.abs(val-x),val));           
                   
//              if(pq.size()!=0)
//                    {
//                        pq.poll();
//                    }
//         }
                   
//                    while(pq.size()!=0)
//                    {
//                        pair p=pq.poll();
//                        l.add(p.value);
//                    }
        
//                    Collections.sort(l);
//                    return l;
//     }
// }

class Solution {

class Pair{
    int key;
    int value;
    
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
    
}

public List<Integer> findClosestElements(int[] arr, int k, int x) {
    int n = arr.length;
    List<Integer> list = new ArrayList<>();
    
    // make max priority queue
    PriorityQueue<Pair> pq = new PriorityQueue<>(
        new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                // if both the keys are same then compare on the bases of their values
                if((b.key - a.key) == 0)
                    return b.value - a.value;
                return b.key - a.key;
            }
    });
    
    for(int i: arr){
        pq.add(new Pair(Math.abs(i-x), i));
        
        if(pq.size() > k)
            pq.poll();
    }
    
    while(pq.size() != 0){
        Pair p = pq.poll();
        list.add(p.value);
    }
    
    Collections.sort(list);
    return list;
}
}