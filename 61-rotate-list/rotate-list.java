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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        k=k%len;
        if(k==0)return head;
        int r=len-k;
        temp.next = head;
        ListNode newtemp=temp;
        while(r>0){
            newtemp=newtemp.next;
            r--;
        }
        ListNode newHead=newtemp.next;
        newtemp.next=null;
        return newHead;
    }
}