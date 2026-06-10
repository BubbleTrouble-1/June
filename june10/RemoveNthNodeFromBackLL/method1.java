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
    static int sizeLL(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int sz=sizeLL(head);
        if(sz==n) return head.next;
        int stop=sz-n-1;
        ListNode curr = head;
        while(stop-->0){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
