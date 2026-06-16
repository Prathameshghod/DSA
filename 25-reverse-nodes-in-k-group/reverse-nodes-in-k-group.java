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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        ListNode grpprev=dummy;
        while(true){
            ListNode kth = grpprev;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;
            
            ListNode nxtgrp=kth.next;
            ListNode prev=nxtgrp;
            ListNode curr=grpprev.next;

            for(int i=0;i<k;i++){
                ListNode nxt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nxt;
            }
            ListNode temp = grpprev.next;
            grpprev.next = kth;
            grpprev = temp;
        }
        return dummy.next;
    }
}