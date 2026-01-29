class Solution {
    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>());
        return res;
    }

    void dfs(int[] a, int i, List<Integer> cur) {
        res.add(new ArrayList<>(cur));
        for (int j = i; j < a.length; j++) {
            cur.add(a[j]);
            dfs(a, j + 1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
