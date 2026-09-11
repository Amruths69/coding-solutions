class Solution {
    public void flatten(TreeNode root) {
        ft(root);
    }

    public TreeNode ft(TreeNode node) {
        if(node == null) {
            return null;
        }

        if(node.left == null && node.right == null) {
            return node;
        }

        TreeNode lt = ft(node.left);
        TreeNode rt = ft(node.right);

        if(lt != null) {
            lt.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rt == null ? lt : rt;
    }
}