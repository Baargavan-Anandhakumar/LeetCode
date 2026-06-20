class Solution {
    public char findTheDifference(String str, String st) {
        for (int i = 0; i < str.length(); i++) {
            if (st.contains(str.charAt(i) + "")) {
                st = st.replaceFirst(str.charAt(i) + "", "");
            }
        }
        return st.charAt(0);
    }
}