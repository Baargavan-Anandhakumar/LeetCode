class Solution {
    public int integerReplacement(int n) {
        long i = n;
        int c = 0;
        while (i > 1) {
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                if (i == 3 || i % 4 == 1) {
                    i--;
                } else
                    i++;
            }
            c++;
        }
        return c;
    }
}