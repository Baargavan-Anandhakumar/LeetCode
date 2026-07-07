class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)
        return 0;
        long sum=0;
        String x="";
        while(n!=0)
        {
            int di=n%10;
            if(di==0)
            {
                n/=10;
                continue;
            }
            x=x+di+"";
            sum=sum+di;
            n/=10;
        }
        StringBuilder sb=new StringBuilder();
        sb=sb.append(x);
        sb=sb.reverse();
        x=sb.toString();
        long ans=Long.parseLong(x)*sum;
        return ans;
    }
}