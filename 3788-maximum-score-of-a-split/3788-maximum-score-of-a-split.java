class Solution {
    public long maximumScore(int[] nums) {
        long pre[] = new long[nums.length];
        pre[0] = nums[0];
        long suff[] = new long[nums.length];
        int min = nums[nums.length - 1];
        for (int i = 1; i < pre.length; i++) {
            pre[i] = pre[i - 1] + nums[i];

        }
        for (int i = nums.length - 2; i >= 0; i--) {
            min = Math.min(min, nums[i + 1]);
            suff[i] = min;
        }
        System.out.println(Arrays.toString(suff));
        long res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            res = Math.max(res, pre[i] - suff[i]);
        }
        return res;
    }
}