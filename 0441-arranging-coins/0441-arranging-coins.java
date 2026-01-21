class Solution {
    public int arrangeCoins(int n) {
        int left = 0;
        int right = n;
        int x = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp=(long)mid * (mid + 1) / 2 ;
            if (temp<= n) {
                x = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return x;
    }
}