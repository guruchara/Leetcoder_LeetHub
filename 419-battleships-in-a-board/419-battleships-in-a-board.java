class Solution {
    public void floodfill(char a[][],int i,int j)
    {
        if(i<0||i>a.length-1 || j<0 || j>a[0].length-1 || a[i][j]!='X')
        {
            return;
        }
        
        a[i][j]='*';
        floodfill(a,i-1,j);
        floodfill(a,i,j-1);
        floodfill(a,i+1,j);
        floodfill(a,i,j+1);
    }
    public int countBattleships(char[][] board) {
        
        int c=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='X')
                {
                   floodfill(board,i,j);                
                    c++;
                }                
            }
        }
        return c;
    }
}