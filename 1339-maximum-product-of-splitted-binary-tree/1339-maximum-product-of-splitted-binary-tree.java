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
    public long prefix(TreeNode node) {
        if (node == null)
            return 0;

        long left = prefix(node.left);
        long right = prefix(node.right);

        node.val += left + right; 
        return (long) node.val;
    }

    public int maxProduct(TreeNode root) {
        long total_sum = prefix(root);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long ans = 0;

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            ans = Math.max(ans, curr.val * (total_sum - curr.val));

            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }

        return (int)(ans % 1000000007);
    }
}