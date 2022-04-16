// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(arr[0],1);
        
        for(int i=1;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else
            {
                int c=hm.get(arr[i]);
                hm.put(arr[i],c+1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(hm.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return 0;
    }  
    
}

