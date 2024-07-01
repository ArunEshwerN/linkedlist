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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        preorderactual(root, al);
        return al;
    }

    public void preorderactual(TreeNode root, List<Integer> al){
        if (root == null){
            return;
        }

        preorderactual(root.left, al);
        
        preorderactual(root.right, al);

        al.add(root.val);

        
    }
}