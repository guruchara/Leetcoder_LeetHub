/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    while(t!=0)
	    {
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	         
		   HashMap<Integer,Integer>hm=new HashMap<>();
		   for(int val:arr)
		   {
		       if(!hm.containsKey(val))
		       {
		           hm.put(val,1);
		       }
		       else
		       {
		           int c=hm.get(val);
		           hm.put(val,c+1);
		       }
		   }
		   
		   // for sorting the array accroding to the frequency 
		  // PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
		   
		   PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->{
		       if(hm.get(a)==hm.get(b))
		       {
		           return a-b;
		       }
		       else
		       {
		           return hm.get(b)-hm.get(a);
		       }
		   });
		   
		   for(int val:hm.keySet())
		   {
		       pq.offer(val);
		   }
		   
		   while(pq.size()!=0)
		   {
		       int x=pq.poll();
		       for(int i=0;i<hm.get(x);i++)
		       {
		           System.out.print(x +" ");
		       }
		   }
		   System.out.println();
		   t--;
	    }
	}
}