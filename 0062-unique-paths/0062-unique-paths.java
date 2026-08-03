class Solution {
    Integer dp[][];
    public int uniquePaths(int m, int n) {
        dp=new Integer[m][n];
        return check(m,n,0,0);
    }
    int check(int m,int n,int i,int j)
    {
        if(i==m-1 && j==n-1)
        {
            return 1;
        }
        if(i>m-1 || j>n-1)
        {
            return 0;
        }
        if(dp[i][j]!=null)
        return dp[i][j];
        return dp[i][j]=check(m,n,i+1,j)+check(m,n,i,j+1);
    }
}