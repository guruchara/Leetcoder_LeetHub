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
    int max = 0;
    public int widthOfBinaryTree(TreeNode root) {
        postOrder(root, 0, 1, new ArrayList<>());
        return max;
    }
    
    private void postOrder(TreeNode cur, int depth, int index, List<Integer> list) {
        if (cur == null) {
            return;
        }
        if (depth == list.size()) {
            list.add(index);
        }
        max = Math.max(max, index - list.get(depth) + 1);
        postOrder(cur.left, depth+1, index*2, list);
        postOrder(cur.right, depth+1, index*2+1, list);
    }
}