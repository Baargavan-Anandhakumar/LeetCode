class Solution {
    public int maxSatisfaction(int[] nums) {
        Arrays.sort(nums);
        int sum=0,tot=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum=sum+(nums[i]);
            if(sum>0)
            {
                tot=tot+sum;
            }
            else
            break;
        }
        return tot;
    }
}