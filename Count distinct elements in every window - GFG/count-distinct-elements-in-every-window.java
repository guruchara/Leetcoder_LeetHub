// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int i =0 ;i<k ;i++)
        {
            if(hs.containsKey(arr[i]))
            hs.put(arr[i] , hs.get(arr[i])+1);
            else
            hs.put(arr[i] , 1);
            
           
        }
         al.add(hs.size());
        for(int i =k ; i<n ; i++)
        {
            if(hs.get(arr[i-k])==1)
            hs.remove(arr[i-k]);
            else
            hs.put(arr[i-k] , hs.get(arr[i-k])-1);
            
            
            if(hs.containsKey(arr[i]))
            hs.put(arr[i] , hs.get(arr[i])+1);
            else
            hs.put(arr[i],1 );
            
            al.add(hs.size());
        }
        
        return al;
    }
}

