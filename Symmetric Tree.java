/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
    if(root==null)
    return true;
    else
    return isMirrorEquals(root.left,root.right);    
    
    }
    
    public boolean isMirrorEquals(TreeNode left, TreeNode right)
    {
        if(left==null || right==null)
            return left==null && right ==null;
        else
            return (left.val==right.val) && isMirrorEquals(left.right,right.left) && isMirrorEquals(left.left,right.right);
    }
}