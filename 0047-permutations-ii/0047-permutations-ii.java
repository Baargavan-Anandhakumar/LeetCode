class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        backtrack(nums, new boolean[nums.length], new ArrayList<>());
        return res;
    }

    void backtrack(int[] nums, boolean[] used, List<Integer> cur) {
        if (cur.size() == nums.length && !res.contains(cur)) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            used[i] = true;
            cur.add(nums[i]);
            backtrack(nums, used, cur);
            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
}
