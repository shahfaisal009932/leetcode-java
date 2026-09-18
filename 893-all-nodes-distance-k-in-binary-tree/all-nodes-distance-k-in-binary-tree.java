/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> hm = new HashMap<>();
        buildMap(root,null,hm);
        HashSet<TreeNode> hs = new HashSet<>();
        List<Integer> ans= new ArrayList<>();
        solve(target, hm, hs, ans, k);
        return ans;
        
    }

    public void solve(TreeNode root, HashMap<TreeNode,TreeNode>hm, HashSet<TreeNode> hs, List<Integer> ans, int k){
        if(root == null || hs.contains(root)){
            return;
        }
        if(k==0){
            ans.add(root.val);
            hs.add(root);
        }
        hs.add(root);
        solve(root.left,hm, hs,ans,k-1);
        solve(root.right,hm, hs,ans,k-1);
        solve(hm.get(root),hm, hs,ans,k-1);
    }
    public void buildMap(TreeNode root, TreeNode parent, HashMap<TreeNode, TreeNode> hm){
        if(root == null)return;

        hm.put(root, parent);
        buildMap(root.left, root,hm);
        buildMap(root.right, root,hm);
        return;
    }
}