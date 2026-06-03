class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
            {
                ans.add(nums[i]);
            }
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<arr.length;i++)
        arr[i]=ans.get(i);
        return arr;
    }
}