class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0,r=1;
        while(r<nums.length)
        {
            if(nums[l]==nums[r])
            {
                r++;
            }
            else
            {
                nums[l+1]=nums[r];
                l++;
            }
            
        }
        return ++l;
    }
}