class Solution {
    public long[] sumOfThree(long num) {
        long n=num/3;
        long ans[]={n-1,n,n+1};
        long sum=0;
        for(long i:ans)
        sum=sum+i;
        if(sum==num)
        return ans;
        return new long[]{};
    }
}