class Solution {
    public int minAddToMakeValid(String s) {
        int st = 0;   
        int end = 0;    

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st++;
            } else { 
                if (st > 0) {
                    st--;
                } else {
                    end++;
                }
            }
        }

        return end + st;
    }
}
