class Solution {
    public int[] twoSum(int[] arr, int t) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int diff=0;
        for(int i=0;i<arr.length;i++)
        {
            diff=t-arr[i];
            if(map.containsKey(diff))
            {
                return new int[] {i,map.get(diff)};
            }
            map.put(arr[i],i);
        }
        return new int [] {};
    }
}