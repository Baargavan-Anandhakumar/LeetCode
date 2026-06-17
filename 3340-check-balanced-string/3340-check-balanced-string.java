class Solution {
    public boolean isBalanced(String num) {
        int odsu = 0;
        int evsu = 0;
        for (int i = 0; i < num.length(); i++) {
            if (i % 2 != 0)
                odsu = num.charAt(i) - '0' + odsu;
            else
                evsu = num.charAt(i) - '0' + evsu;
        }
        return odsu == evsu ? true : false;
    }
}