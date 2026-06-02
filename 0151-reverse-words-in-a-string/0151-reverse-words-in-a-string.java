class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        String x="";
        for(int i=str.length-1;i>=0;i--)
        {
            x=x+str[i];
            if(i>0)
            x=x+" ";
        }
        return x;
    }
}