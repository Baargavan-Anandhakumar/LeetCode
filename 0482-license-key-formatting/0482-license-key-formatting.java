class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String z[]=s.split("-");
        s="";
        for(String i:z)
        s=s+i;
        int c=1;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(c%k!=0)
            {
                sb=sb.append(s.charAt(i));
                c++;
            }
            else 
            {
                sb=sb.append(s.charAt(i));
                if(i!=0)
                sb=sb.append("-");
                c++;
            }
        }
        String res=sb.reverse().toString().toUpperCase();
        return res;
    }
}