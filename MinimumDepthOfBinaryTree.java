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
    public int minDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        else if(root.left==null)
        return 1+height(root.right);
        else if(root.right==null)
        return 1+height(root.left);
        else
            return 1+min(height(root.left),height(root.right));
        
    }
    
    public int min(int a,int b)
    {
        return a<b?a:b;
    }
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else if(root.left==null)
            return 1+height(root.right);
        else if(root.right==null)
            return 1+height(root.left);
        else
        return 1+min(height(root.left),height(root.right));
    }
}