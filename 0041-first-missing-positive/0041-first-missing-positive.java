class Solution {
    public int firstMissingPositive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i>0)
                map.put(i,1);
        }
        int cnt=1;
        for(int i:map.keySet()){
            if(!map.containsKey(cnt)){
                return cnt;
            }
            else{
                cnt++;
            }
        }
        return cnt;
    }
}