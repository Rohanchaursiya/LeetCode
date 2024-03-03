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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode temp=head;
        // int size=0;
        // while(temp!=null){
        //     temp=temp.next;
        //     size++;
        // }
        // ListNode prev=head;
        // int newsize=size-n+1;
        // int i=0;
        // while(i<newsize){
        //     prev=prev.next;
        //     i++;
        // }
        // prev.val=prev.next.val;
        // return head;
        ListNode slow=head;
        ListNode fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}