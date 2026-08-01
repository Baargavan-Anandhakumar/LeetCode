class Solution {
    public String reversePrefix(String s, char ch) {
        String res = "";
        Stack<Character> st = new Stack<>();
        int c = 0;
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            c++;
            if (s.charAt(i) == ch) {
                flag = true;
                break;
            }
        }

        if (!flag)
            return s;

        while (!st.isEmpty()) {
            res = res + st.pop();
        }

        res = res + s.substring(c);
        return res;
    }
}