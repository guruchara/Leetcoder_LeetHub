// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    String list[] = new String[n];
                    for(int i = 0;i<n;i++)
                        list[i] = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWords(list, n));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWords(String arr[], int n)
    {
        
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put(arr[0],1);
        
        LinkedHashSet<String>h=new LinkedHashSet<>();
        
        for(int i=1;i<arr.length;i++)
        {
            h.add(arr[i]);
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
        
        int c=0;
        
        for(String val:h)
        {
            if(hm.get(val)==2)
            {
                c++;
            }
        }
        return c;
    }
}