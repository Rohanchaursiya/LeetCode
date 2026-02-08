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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        return true;
        int lefth=getHeight(root.left);
        int righth=getHeight(root.right);
        if(Math.abs(righth-lefth)<2 && isBalanced(root.left) && isBalanced(root.right))
        return true;

        return false;
        
    }
    public static int getHeight(TreeNode node)
    {
        if(node ==null)
        return 0;
       Queue<TreeNode> q=new LinkedList<>();
       int count=0;
       q.add(node);
       while(!q.isEmpty())
       {
        int size=q.size();
        for(int i=0;i<size;i++)
        {
            TreeNode temp=q.poll();
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }
        count++;
       }
       return count;
    }
}