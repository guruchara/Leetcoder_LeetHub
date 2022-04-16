// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String s)
    {
      HashMap<Character,Integer>hm=new LinkedHashMap<>();
        
        char a[]=s.toCharArray();
        
        hm.put(a[0],1);
        
        for(int i=1;i<a.length;i++)
        {
            if(!hm.containsKey(a[i]))
            {
                hm.put(a[i],1);
            }
            else
            {
                int c=hm.get(a[i]);
                hm.put(a[i],c+1);
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(hm.get(a[i])==1)
            {
                return a[i];
            }
        }
        return '$';
    }
}

