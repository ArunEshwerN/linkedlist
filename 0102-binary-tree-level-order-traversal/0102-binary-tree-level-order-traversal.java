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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> li = new ArrayList<>();

        if (root == null) return li;

        q.offer(root);

        while(q.size() != 0){

            List<Integer> li2 = new ArrayList<>();
            int currentsize = q.size();

            for (int i = 0; i<currentsize; i++){

                if (q.peek().left != null){
                    q.offer(q.peek().left);
                }

                if (q.peek().right != null){
                    q.offer(q.peek().right);
                }

                li2.add(q.poll().val);

            }

            li.add(li2);
        }

        return li;


    }
}