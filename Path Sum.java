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
    public boolean hasPathSum(TreeNode root, int sum) {
     
        if(root==null)
            return false;
        else if(sum-root.val==0 && root.left==null && root.right==null)
                return true;
        else if(sum-root.val==0 && ((root.left!=null && root.right==null) || (root.left==null && root.right!=null)))
            return false;
        else
            return (hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val));
    }
}