/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public static void PreOrder(ArrayList<Integer> li,Node root){
        if(root==null)return;
        li.add(root.val);
        for(Node child : root.children){
            PreOrder(li,child);
        }
        
    }
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> li=new ArrayList<>();
        PreOrder(li,root);
        return li;
    }
}