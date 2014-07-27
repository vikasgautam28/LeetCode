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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
            return true;
        else
        {
            int h1=height(root.left);
            int h2=height(root.right);
            
            return  abs(h1-h2)<=1 && isBalanced(root.left) && isBalanced(root.right);
            
        }
    }
    
    public int abs(int n)
    {
        return n>=0? n: (-1*n);
    }
    
    public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        else
            return 1+max(height(root.left),height(root.right));
    }
    
    public int max(int a, int b)
    {
        return a>b? a: b;
    }
    

}
