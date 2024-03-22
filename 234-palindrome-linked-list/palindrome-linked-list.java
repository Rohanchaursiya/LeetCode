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
    public boolean isPalin(String s){
        if(s.length()==0)return true;
        int i=0;
        while(i<s.length()/2){
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
            i++;
        }
        return true;

    }
    public boolean isPalindrome(ListNode head) {
        String s="";
        while(head!=null){
            s+=head.val;
            head=head.next;
        }
        
        return isPalin(s);
    }
}