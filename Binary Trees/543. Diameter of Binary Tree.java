/* https://leetcode.com/problems/diameter-of-binary-tree/ */


class Solution {
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        int ans = Math.max(left,right)+1;
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int op1 = diameterOfBinaryTree(root.left);
        int op2 = diameterOfBinaryTree(root.right);
        int op3 = height(root.left) + height(root.right );
        return Math.max(op1 , Math.max(op2,op3));
    }
}

