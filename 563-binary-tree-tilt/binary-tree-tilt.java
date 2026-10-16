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
    public int findTilt(TreeNode root) {
        int[] ans = {0};
        solve(root,ans);
        return ans[0];
    }
    public int solve(TreeNode root, int[] ans){
        if(root==null){
            return 0;
        }
        int lc = solve(root.left, ans);
        int rc = solve(root.right, ans);
        ans[0] += Math.abs(lc-rc);
        return lc+rc+root.val;
    }
}