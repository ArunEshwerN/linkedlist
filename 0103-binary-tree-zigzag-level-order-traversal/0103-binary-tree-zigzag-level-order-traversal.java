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
        List<List<Integer>> li = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        

        if (root == null){
            return li;
        }

        q.offer(root);

        while(q.size()!= 0){
            List<Integer> li2 = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i<size; i++){
                TreeNode current = q.poll();

                if (current.left != null){
                    q.offer(current.left);
                }

                if (current.right != null){
                    q.offer(current.right);
                }
                 if (flag) {
                    li2.add(current.val);
                } else {
                    li2.add(0, current.val); // Add to the beginning for reverse order
                }
                
                
            }
            flag = !flag;
            li.add(li2);
        }

        return li;
    }
}