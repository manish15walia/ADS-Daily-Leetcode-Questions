/* https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/  */

class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
    if (root == null || root == n1 || root == n2) {
      return root;
    }

    TreeNode leftans = lowestCommonAncestor(root.left, n1, n2);
    TreeNode rightans = lowestCommonAncestor(root.right, n1, n2);

    if (leftans != null && rightans != null) {
      return root;
    } else if (leftans != null) {
      return leftans;
    } else {
      return rightans;
    }
  }
}
236. Lowest Common Ancestor of a Binary Tree
