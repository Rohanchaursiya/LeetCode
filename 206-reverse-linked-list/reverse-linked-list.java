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
    public ListNode reverseList(ListNode Head) {
        if(Head==null || Head.next==null)return Head;
        ListNode head=reverseList(Head.next);
        Head.next.next=Head;
        Head.next=null;
        return head;
    }
}