class Solution {
    public int maxFreqSum(String s) {
        char ch[]=s.toCharArray();
        int vf=0;
        int cf=0;
        int vm=0;
        int cm=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        for(char c:map.keySet())
        {
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            vf=map.get(c);
            if(vf>vm)
            vm=vf;
            }
            else
            {
                cf=map.get(c);
                if(cf>cm)
                cm=cf;
            }
        }
        return cm+vm;
    }
}