class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int res = 1,max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1)
                res++;
            else if(nums[i]-nums[i-1]>1)
            {
                if(res>max)
                    max=res;
                res=1;
            }
            else
                continue;
        }
        if(res>max)
            max=res;
        return max;
    }
}