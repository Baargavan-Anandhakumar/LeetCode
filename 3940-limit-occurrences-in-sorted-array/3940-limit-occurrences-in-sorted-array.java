class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])<=k)
            {
                list.add(nums[i]);
            }
        }
        int ans[]=new int[list.size()];;
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}