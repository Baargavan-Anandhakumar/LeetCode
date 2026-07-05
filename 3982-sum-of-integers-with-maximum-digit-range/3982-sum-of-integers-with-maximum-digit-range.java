class Solution {
    public int maxDigitRange(int[] nums) {
     int m=-1;
    int sum=0;
    for(int i:nums)
        {
            int range=func(i);
            if(range>m)
            {
                m=range;
                sum=i;
            }
            else if(range==m)
            {
                sum+=i;
            }
        }
        return sum;
    }
    static int func(int n)
    {
        if(n==0)
            return 0;
        int min=9;
        int max=0;
        while(n>0)
            {
                int digi=n%10;
                min=Math.min(digi,min);
                max=Math.max(digi,max);
                n/=10;
            }
        return max-min;
    }
}