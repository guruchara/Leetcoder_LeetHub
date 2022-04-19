class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
//          if(nums.length==0 || nums.length==1)
//          {
//              List<List<Integer>>k=new ArrayList<>();
//              return k;
//          }
//         HashSet<List<Integer>>lh=new HashSet<>();
        
//         // LinkedHashSet<List<Integer>>h=new LinkedHashSet<>()
//         HashMap<Integer,Integer>hm=new HashMap<>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//             hm.put(nums[i],1);
//         }
        
//         HashSet<Integer>h=new HashSet<Integer>();
//           for(int val:nums)
//           {
//               h.add(val);
//           }
        
        
//         if(h.size()==1)
//         {
//              List<List<Integer>>k=new ArrayList<>();

//             ArrayList<Integer>l=new ArrayList<>();
//              for(int x:nums)
//              {
//                  l.add(x);
//              }            
//             k.add(l);
//             return k;
//         }
                        
//         for(int i=0;i<nums.length-1;i++)
//         {
//            for(int j=i+1;j<nums.length;j++)
//            {
//                int sum=nums[i]+nums[j];
//                ArrayList<Integer>l=new ArrayList<>();                
//                if(hm.containsKey(sum) && nums[i]!=sum && nums[j]!=sum)
//                {
//                     l.add(nums[i]);
//                     l.add(nums[j]);
//                     int x=(-1)*sum;
//                     l.add(x);
//                }
               
         
//                if(l.size()==3)
//                {                  
//                    Collections.sort(l);
//                    lh.add(l);
//                }
//            }
//         }
//         return new ArrayList<>(lh);
        
        
        Arrays.sort(num);

        List <List < Integer >> res = new ArrayList < > ();

        for (int i = 0; i < num.length - 2; i++) {

            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {

                int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];

                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        ArrayList < Integer > temp = new ArrayList < > ();
                        temp.add(num[i]);
                        temp.add(num[lo]);
                        temp.add(num[hi]);
                        res.add(temp);

                        while (lo < hi && num[lo] == num[lo + 1]) lo++;
                        while (lo < hi && num[hi] == num[hi - 1]) hi--;

                        lo++;
                        hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;

                    else hi--;
                }
            }
        }
        return res;
    }
}