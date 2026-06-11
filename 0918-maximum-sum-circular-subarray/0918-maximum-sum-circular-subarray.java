class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int s = 0;
        int mx = nums[0];
        int mn = nums[0];
        int cmx = 0;
        int cmn = 0;
        for (int x : nums) {
            s = s + x;
            cmx = Math.max(x, cmx + x);
            mx = Math.max(mx, cmx);
            cmn = Math.min(x, cmn + x);
            mn = Math.min(mn, cmn);
        }
        if (mx < 0) {
            return mx;
        }
        return Math.max(mx, s - mn);
    }
}