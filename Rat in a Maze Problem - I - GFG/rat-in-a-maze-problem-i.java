// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix

class Solution {
   
    
    public static void floodfill(int i,int j,int n,int a[][],ArrayList<String>l,String s)
    {
        if(i<0 ||  i>n-1|| j<0 || j>n-1|| a[i][j]==0)
        {
            return;
        }
        
        if(i==n-1 && j==n-1)
        {
            l.add(s);
            return ;
        }
        
        a[i][j]=0;
        
        // now follow the rat in maze path
        floodfill(i-1,j,n,a,l,s+"U");
        floodfill(i,j-1,n,a,l,s+"L");
        floodfill(i+1,j,n,a,l,s+"D");
        floodfill(i,j+1,n,a,l,s+"R");
        
        a[i][j]=1;
        return ;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        
        String s="";
        ArrayList<String>l=new ArrayList<>();
        // i , j , n, matrix , string
        floodfill(0,0,n,m,l,s);
        return l;
    }
}