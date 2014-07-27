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
    public int sumNumbers(TreeNode root) {
        
        
        return sumnums(root,0);
        
    }
    
    public int sumnums(TreeNode root, int val)
    {
        if(root==null)
            return 0;
            
        else
        {
            val=val*10+root.val;
            
            if(root.left==null && root.right==null)
            {
                return val;
            }
            else
            {
                return sumnums(root.left,val)+sumnums(root.right,val);
            }
        }
    }
}