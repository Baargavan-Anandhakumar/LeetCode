/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean rev = false;

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> l = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                TreeNode x = q.poll();
                l.add(x.val);
                if (x.left != null) q.add(x.left);
                if (x.right != null) q.add(x.right);
            }

            if (rev) Collections.reverse(l);
            list.add(l);
            rev = !rev;
        }
        return list;
    }
}
