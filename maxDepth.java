
class Solution {

    public int maxDepth(TreeNode root) {

        if ( root == null)
            return 0;
        

        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);

        int ans = Math.max(leftheight, rightheight) + 1;

        return ans;
        
    }
    public boolean isBalanced(TreeNode root) {

        if (root == null)
        return true;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (Math.abs(left - right) > 1)
            return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
}
