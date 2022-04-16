// { Driver Code Starts
//Initial Template for Java





import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



class Solution
{
    ArrayList<Long> findMissing(long arr1[], long arr2[], int N, int M)
    {
        
       LinkedHashMap<Long,Long>hm=new LinkedHashMap<>();
       
       hm.put(arr1[0],(long)(1));
       
       for(int i=1;i<arr1.length;i++)
       {
           if(!hm.containsKey(arr1[i]))
           {
               hm.put(arr1[i],(long)1);
           }
           else
           {
              long  c=hm.get(arr1[i]);
               hm.put(arr1[i],(long)(c+1));
           }
       }
       HashMap<Long,Long>hm1=new HashMap<>();
       hm1.put(arr2[0],(long)1);
       
       for(int i=1;i<arr2.length;i++)
       {
           if(hm1.containsKey(arr2[i]))
           {
             long  x=hm1.get(arr2[i]);
               hm1.put(arr2[i],(long)(x+1));
           }
           else
           {
               hm1.put(arr2[i],(long)1);
           }
       }
       
       ArrayList<Long>l=new ArrayList<>();
       for(int i=0;i<arr1.length;i++)
       {
           if(hm1.containsKey(arr1[i]))
           {
               continue;
           }
           else
           {
               l.add(arr1[i]);
           }
       }
        
       return l;
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int m =Integer.parseInt(q[1]);
            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = Long.parseLong(a2[i]);
            }
            Solution ob = new Solution();
            ArrayList<Long> ans=ob.findMissing(a,b,n,m);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }
}


  // } Driver Code Ends