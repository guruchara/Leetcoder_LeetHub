// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        HashMap<Integer,Integer>hm=new HashMap<>();
          HashSet<Integer>h=new HashSet<Integer>();
          
        hm.put(arr[0],1);
        h.add(arr[0]);
        
      
        
        for(int i=1;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                h.add(arr[i]);
                hm.put(arr[i],1);
            }
            else
            {
                int c=hm.get(arr[i]);
                hm.put(arr[i],c+1);
            }
        }
        
        if(h.size()==arr.length)
        {
            ArrayList<Integer>l=new ArrayList<>();
            l.add(-1);
            return l;
        }
        
        ArrayList<Integer>l=new ArrayList<>();
        
        for(int val:h)
        {
            int x=hm.get(val);
            
            if(x>1)
            {
                l.add(val);
            }
        }
        Collections.sort(l);
        return l;
    }
}
