// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int nums1[], int nums2[]) 
    {
              ArrayList<Integer>l=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++)
        {
            l.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            l.add(nums2[i]);
        }
        
        Collections.sort(l);
        
        if(l.size()%2!=0)
        {
            // System.out.println(l.get(l.size()/2)/1.0);
            return l.get(l.size()/2)/1.0;
        }
        else
        {
            double x=l.get((l.size()/2)-1);
            double y=l.get(l.size()/2);
            
            return (x+y)/2.0;
        }
    }
}