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
    public List<Integer> postorderTraversal(TreeNode root) {
     
     ArrayList<Integer> list=new ArrayList<Integer>();
        
        if(root==null)
        {
            return list;
        }
        else
        {
            
            list.addAll(postorderTraversal(root.left));
            list.addAll(postorderTraversal(root.right));
            list.add(root.val);
            return list;
        }
        
    }
}
