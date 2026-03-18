class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0,n=needle.length();n<=haystack.length();i++,n++)
        {
            if(haystack.substring(i,n).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}