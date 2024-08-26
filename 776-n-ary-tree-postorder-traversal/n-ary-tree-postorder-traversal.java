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
    public static void PostOrder(ArrayList<Integer> li,Node root){
        if(root==null)return;
        for(Node child : root.children){
            PostOrder(li,child);
        }
        li.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ArrayList<Integer> li=new ArrayList<>();
        PostOrder(li,root);
        return li;
        
    }
}