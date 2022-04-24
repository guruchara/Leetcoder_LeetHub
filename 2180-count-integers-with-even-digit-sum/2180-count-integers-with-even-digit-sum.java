class Solution {
    public int count(int n){
        
        int res=0;
        
        while(n!=0)
        {
            res=res+n%10;
            n/=10;
        }
        return res;
    }
    public int countEven(int num) {
        
        int c=0;
        
        for(int i=2;i<=num;i++)
        {
            if(count(i)%2==0)
            {
                c++;
            }
        }
        return c;
    }
}