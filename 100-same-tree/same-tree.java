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
    private boolean inorder(TreeNode p,TreeNode q){
        if(p==null ||q==null){
            return p==null&&q==null;
        }
        if(!inorder(p.left,q.left)){
            return false;
        }
        if(p.val!=q.val)return false;
        if(!inorder(p.right,q.right)){
            return false;
        }
        return true;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p,q);
    }
}