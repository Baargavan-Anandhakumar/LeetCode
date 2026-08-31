class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.merge(i,1,Integer::sum);
        }
        int max=0,key=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }
}