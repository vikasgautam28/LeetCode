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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        if(root==null)
        {
            return list;
        }
        else{
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll( inorderTraversal(root.right));
        return list;
        }
        
        
        
        
        
    }
}