class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        int tar=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int left=i;
            int l=left+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=nums[left]+nums[l]+nums[r];
                if(sum==target)
                return target;
                if(Math.abs(sum-target)<Math.abs(ans-target))
                ans=sum;
                if(sum<target)
                l++;
                else
                r--;
            }
        }
        return ans;
    }
}

