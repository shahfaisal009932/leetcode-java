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
    public int sumNumbers(TreeNode root) {
        int[] ans = new int[1];
        solve(root, ans,"");
        return ans[0];
    }
    void solve(TreeNode root, int[] ans, String curr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            curr += root.val;
            ans[0] += Integer.parseInt(curr);
            return;
        }
        curr += root.val;
        solve(root.left, ans, curr);
        solve(root.right, ans, curr);
        return;
    }
}