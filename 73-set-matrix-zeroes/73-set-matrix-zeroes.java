class Solution {
    public void setZeroes(int[][] a) {
        
        // take two dummy list 
        // row list
        ArrayList<Integer>row=new ArrayList<>();
        
        // col list
        ArrayList<Integer>col=new ArrayList<>();
        
        // traverse the matrix and check wether any value which is equal to 0
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
        // we traverse according to row
        // int n=row.size or col.size do mese kuchh bhi le sakte he 
        int n=col.size();
        
        for(int i=0;i<n;i++)
        {
            // h horizontly 
            int h=row.get(i);
            // v verticly
            int v=col.get(i);
            
            // specific row ko zero krenge
            for(int k=0;k<a[0].length;k++)
            {
                a[h][k]=0;
            }
            
            // specific col ko zero ko krenge
            for(int k=0;k<a.length;k++)
            {
                a[k][v]=0;
            }
        }
    }
}