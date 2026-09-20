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
    int md=0;
    public int diameterOfBinaryTree(TreeNode root) {
        gt(root);
        return md;

        
    }
    private int gt(TreeNode node){
        if(node==null)return 0;
        int lh=gt(node.left);
        int rh=gt(node.right);
        md=Math.max(md,lh+rh);
        return 1+Math.max(lh,rh);
    }
}