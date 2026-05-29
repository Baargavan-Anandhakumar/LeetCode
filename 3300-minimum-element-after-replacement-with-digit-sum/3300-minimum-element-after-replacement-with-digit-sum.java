class Solution {
    public int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            sum+=(n%10);
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            int sum = sumOfDigits(nums[i]);

            if(sum < min) min = sum;
        }

        return min;
    }
}