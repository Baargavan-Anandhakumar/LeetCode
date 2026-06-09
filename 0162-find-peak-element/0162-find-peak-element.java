class Solution {
    public int findPeakElement(int[] nums) {
        long max=Long.MIN_VALUE;
        int i=0;
        int ind=0;
        int j=nums.length/2;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]>max){
            max=nums[i];
            ind=i;
            }
            if(nums[j]>max){
            max=nums[j];
            ind=j;
            }
            i++;
            j++;
        }
        return ind;
    }
}