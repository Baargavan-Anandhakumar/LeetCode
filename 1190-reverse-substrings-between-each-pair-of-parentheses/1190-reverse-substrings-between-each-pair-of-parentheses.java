class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')')
            {
                st.push(s.charAt(i));
            }
            else
            {
                String x="";
                while(st.peek()!='(')
                {
                    x+=st.pop()+"";
                }
                st.pop();
                for(int j=0;j<x.length();j++)
                {
                    st.push(x.charAt(j));
                }
            }
        }
        while(!st.empty())
        {
            res=st.pop()+res;
        }
        return res;
    }
}