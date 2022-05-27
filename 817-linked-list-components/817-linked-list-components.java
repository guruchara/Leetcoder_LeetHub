/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Radha Swami Ji
// class Solution {
//     public int numComponents(ListNode head, int[] nums) {
        
//         if(head.next==null || nums.length==1)
//         {
//             return 1;
//         }
//         ListNode simple=head;
//         ListNode curr=head;
        
//         HashMap<Integer,Integer>hm=new HashMap<>();
        
//         ArrayList<Integer>l=new ArrayList<Integer>();
//         while(curr!=null)
//         {
//             if(!hm.containsKey(curr.val))
//             {
//                hm.put(curr.val,1); 
//             }            
//             curr=curr.next;
//         }
        
//         for(int i=0;i<nums.length;i++)
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
        
//         while(simple!=null)
//         {
//             if(hm.get(simple.val)==1)
//             {
//                 return simple.val;
//             }
//             simple=simple.next;
//         }
//         return -1;
//     }
// }


class Solution 
{    
    public int numComponents(ListNode head, int[] nums) 
    {
        HashSet<Integer> h = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++) h.add(nums[i]);
        
        ListNode n=head;
        
        while(n!=null){
            
            if(n.next!=null){
                int v=n.next.val;
                
                if(h.contains(v)){
                    h.remove(n.val);
                }
            }
            n=n.next;
        }
        return h.size();
    }
}