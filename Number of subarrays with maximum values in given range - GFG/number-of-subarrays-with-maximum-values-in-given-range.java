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
		    
		    String line1 = br.readLine();
		    String []element = line1.trim().split(" ");
		    int n = Integer.parseInt(element[0]);
		    int l = Integer.parseInt(element[1]);
		    int r = Integer.parseInt(element[2]);
		    
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.countSubarrays(arr, n, l, r));
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    static long countSubarrays(int nums[], int n, int left, int right)  
    { 
         int si=0;
        int ei=0;
        
        long  c=0;
        long prevc=0;
        
        while(ei<n)
        {
            if(left<=nums[ei] && nums[ei]<=right)
            {
                 prevc=ei-si+1;
                 c+=prevc;
            }
            else if(left>nums[ei])
            {
                c+=prevc;
            }
            else
            {
                si=ei+1;
                prevc=0;
            }
            ei++;
        }
        return c;
    } 
}

