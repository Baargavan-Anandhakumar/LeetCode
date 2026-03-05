class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) sum += n;

        if (sum % k != 0) return false;

        int target = sum / k;
        boolean[] used = new boolean[nums.length];

        return backtrack(nums, used, k, 0, 0, target, 0);
    }

    private boolean backtrack(int[] nums, boolean[] used, int k,
                              int start, int currSum, int target, int count) {

        if (count == k - 1) return true;

        if (currSum == target) {
            return backtrack(nums, used, k, 0, 0, target, count + 1);
        }

        for (int i = start; i < nums.length; i++) {
            if (used[i]) continue;

            if (currSum + nums[i] > target) continue;

            used[i] = true;

            if (backtrack(nums, used, k, i + 1, currSum + nums[i], target, count))
                return true;

            used[i] = false;
        }

        return false;
    }
}