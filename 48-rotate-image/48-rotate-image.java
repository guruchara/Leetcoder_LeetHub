class Solution {
    public void rotate(int[][] a) {
        
          int n=a.length;
        
           int temp[][]=new int[n][n];
        
         // column se start kiya he
         for(int j=0;j<n;j++)
         {
             // here rows
             int k=0;
            for(int i=n-1;i>=0;i--)
            {
                System.out.print(a[i][j] +" ");
                temp[j][k++]=a[i][j];
            }
             System.out.println();
         }
         
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=temp[i][j];
            }
        }
    }
}