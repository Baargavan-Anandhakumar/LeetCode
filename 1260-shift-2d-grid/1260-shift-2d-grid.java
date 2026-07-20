class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }
        for (int i = 1; i <= k; i++) {
            int l = list.get(list.size() - 1);
            list.removeLast();
            list.addFirst(l);
        }
        List<List<Integer>> res = new ArrayList<>();
        int ind = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> rows = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                rows.add(list.get(ind++));
            }
            res.add(rows);
        }
        return res;
    }
}