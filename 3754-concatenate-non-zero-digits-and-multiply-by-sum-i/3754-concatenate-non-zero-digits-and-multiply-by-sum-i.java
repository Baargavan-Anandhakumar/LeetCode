class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long res=0;
        int digit=1;
        while(n!=0)
        {
            int digi=n%10;
            if(digi!=0)
            {
                res=digi*digit+res;
                digit*=10;
                sum+=digi;
            }
            n/=10;
        }
        System.gc();
        return res*sum;
    }
}