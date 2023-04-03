/* https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ */


class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums,0,nums.length-1);
        
    }
    public TreeNode toBST(int [] nums , int l,int r){
        if(l>r) return null; //Tree k leaf node se left , right p jane k try krge tb l > r hoga. 
        int m = (l+r)/2;

        TreeNode root = new TreeNode(nums[m]);
        root.left = toBST(nums,l,m-1);
        root.right = toBST(nums,m+1,r);
        return root;
    }
}
