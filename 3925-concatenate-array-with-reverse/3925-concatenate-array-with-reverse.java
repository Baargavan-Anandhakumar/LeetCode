class Solution {
    public int[] concatWithReverse(int[] nums) {
        int res[]=new int[nums.length*2];
        int left=0;
        int right=res.length-1;
        for(left=0,right=res.length-1;left<=right;left++,right--)
        {
            res[left]=nums[left];
            res[right]=nums[left];
        }
        return res;
    }
}