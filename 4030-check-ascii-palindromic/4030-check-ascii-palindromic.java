class Solution {
    public boolean isPalindromic(String s) {
        String x = "";
        StringBuilder z = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = (int) c;
            x += String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
            z.append(String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0'));
        }
        z = z.reverse();
        System.out.println(x);
        System.out.println(z);
        return x.equals(z.toString()) ? true : false;
    }
}