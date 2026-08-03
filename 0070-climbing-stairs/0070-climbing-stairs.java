class Solution {
    public int climbStairs(int n) {
      
        int dp[] = new int[n + 1];
        Arrays.fill(dp,-1);
        back(0, n, dp);
        return dp[0];
    }

     int back(int n,int t,int [] dp)
    {
        if(n==t)
            return 1;
        if(n>t)
            return 0;
        if(dp[n]!=-1)
            return dp[n];
        dp[n]= back(n+1,t,dp)+back(n+2,t,dp);
        return dp[n];
    }
}