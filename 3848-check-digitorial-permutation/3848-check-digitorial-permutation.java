class Solution {
    public boolean isDigitorialPermutation(int n) {
        int temp = n;
        int digi = 0;
        int freq[] = new int[10];
        while(temp!=0){
            digi = digi + permutation(temp%10);
            freq[temp%10]++;
            temp /= 10;
        }
        if(digi==n)
            return true;
        int freq2[] = new int[10];
        while(digi!=0){
            freq2[digi%10]++;
            digi /= 10;
        }
        if(Arrays.equals(freq,freq2))
            return true;
        return false;
    }
    static int permutation(int n){
        int res = 1;
        for(int i=1;i<=n;i++)
            res *= i;
        return res;
    }
}