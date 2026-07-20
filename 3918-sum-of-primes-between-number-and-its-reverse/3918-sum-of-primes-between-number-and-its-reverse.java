class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int num = n;
        if (n == 2 || n == 3 || n == 5 || n == 7)
            return n;
        if (n < 10)
            return 0;
        while (num != 0) {
            int digi = num % 10;
            rev = rev * 10 + digi;
            num /= 10;
        }
        int sum = 0;
        int max = Math.max(n, rev);
        for (int i = Math.min(n, rev); i <= max; i++) {
            if (check(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean check(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}