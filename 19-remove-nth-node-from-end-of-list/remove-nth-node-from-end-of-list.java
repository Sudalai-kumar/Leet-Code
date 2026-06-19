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
        ListNode temp=head;
        if(temp.next==null && n==1) return null;
        int l=0;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        n=l-n;
        // System.out.println(n);
        if (n == 0) {
            return head.next;
        }
        temp=head;
        while( n>1){
            n--; 
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}