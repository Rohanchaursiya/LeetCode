/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean isMirror(TreeNode temp1,TreeNode temp2){
        if(temp1==null && temp2==null)return true;
        if(temp1==null || temp2==null)return false;
        return temp1.val==temp2.val && isMirror(temp1.left,temp2.right) && isMirror(temp1.right,temp2.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return false;
        return isMirror(root.left,root.right);
    }
}