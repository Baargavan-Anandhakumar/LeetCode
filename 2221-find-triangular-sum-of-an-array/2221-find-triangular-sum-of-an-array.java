class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int arr[][] = new int[nums.length][nums.length];
        for(int i=0;i<nums.length;i++)
            arr[0][i] = nums[i];
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++)
                arr[i][j] = (arr[i-1][j]+arr[i-1][j+1])%10;
        }
        return arr[nums.length-1][0];
    }
}