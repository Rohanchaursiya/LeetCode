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
    public static void postorder(ArrayList<Integer> li,TreeNode root){
        if(root==null)return ;
        postorder(li,root.left);
        postorder(li,root.right);
        li.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        postorder(li,root);
        return li;
        
    }
}