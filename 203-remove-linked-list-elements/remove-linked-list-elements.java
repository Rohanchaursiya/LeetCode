/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        head.next=removeElements(head.next,val);
        return head.val ==val ? head.next : head;


        
        // ListNode temp=head;
        // while(temp!=null){
        //     if(temp.next.val==val){
        //         temp.next=temp.next.next;
        //     }
        //     temp=temp.next;
        // }
        // return head;
        
    }
}