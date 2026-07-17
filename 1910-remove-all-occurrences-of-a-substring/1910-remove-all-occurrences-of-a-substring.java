class Solution {
    public String removeOccurrences(String s, String part) {
        while(true)
        {
            if(s.contains(part))
            {
                s=s.replaceFirst(part,"");
                System.out.println(s);
            }
            else
            {
                break;
            }
        }
        return s;
    }
}