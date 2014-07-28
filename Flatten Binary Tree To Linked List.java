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
    public void flatten(TreeNode root) {
        
        flattenTree(root);
    }
    
    public TreeNode flattenTree(TreeNode root)
    {
        if(root==null)
            return root;
            
        else
        {
            TreeNode r=root;
            TreeNode left=root.left;
            TreeNode right=root.right;
            root.left=null;
            root.right=flattenTree(left);
            
            while(root.right!=null)
            {
                root=root.right;
            }
            
            root.right=flattenTree(right);
            
            return r;
        }
        
    }
}