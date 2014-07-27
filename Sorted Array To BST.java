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
    public TreeNode sortedArrayToBST(int[] num) {
        return sa(num, 0, num.length-1);
    }
    public TreeNode sa(int[] num, int start, int end){
        if(start>end)
        return null;
        else
        {
            int mid=start+(end-start)/2;
            TreeNode node=new TreeNode(num[mid]);
            
            node.left=sa(num,start,mid-1);
            node.right=sa(num,mid+1,end);
            return node;
        }
    }
}