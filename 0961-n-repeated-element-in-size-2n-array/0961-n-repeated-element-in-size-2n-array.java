class Solution {
    public int repeatedNTimes(int[] nums) {
       int n=nums.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer>temp:map.entrySet())
        {
            if(temp.getValue()==n)
            return temp.getKey();            
        }
        return 0;
    }
}