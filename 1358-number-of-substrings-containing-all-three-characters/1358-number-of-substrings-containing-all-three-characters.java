class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int st=0;
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
            while(map.size()==3)
            {
                c=c+ch.length-i;
                map.put(ch[st],map.getOrDefault(ch[st],0)-1);
                if(map.get(ch[st])==0)
                map.remove(ch[st]);
                st++;
            }
        }
        return c;
    }
}