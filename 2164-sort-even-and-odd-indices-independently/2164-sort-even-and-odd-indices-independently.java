class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        int a[]=new int[nums.length];
           
        ArrayList<Integer>odd=new ArrayList<>();
        
        ArrayList<Integer>even=new ArrayList<>();
                
        
          for(int i=0;i<nums.length;i++)
          {
              if(i%2==0)
              {
                  even.add(nums[i]);
              }
              else
              {
                  odd.add(nums[i]);
              }
          }
          
         Collections.sort(even);
         Collections.sort(odd);
         Collections.reverse(odd);
           
//            ArrayList<Integer>l=new ArrayList<Integer>();
        
//             for(int val:x2)
//             {
//                 l.add(val);
//             }
        
          // Collections.reverse(l);
          
          // System.out.println(l);
        
           int y=0;
           int z=0;
          
          for(int i=0;i<nums.length;i++)
          {
              if(i%2==0)
               {
                 a[i]=even.get(z);
                  z++;                                    
               }        
              else
              {                                                       
                a[i]=odd.get(y);
                  y++; 
              }               
                                        
          }
        return a;
       }
    }