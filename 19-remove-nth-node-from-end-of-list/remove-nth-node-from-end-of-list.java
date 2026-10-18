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
       ListNode node=head;
       int l=0;
       if(node.next==null && n==1) return null;
       while(node!=null){
          node=node.next;
          l++;
       }
       n=l-n;
        if (n == 0) {
            return head.next;
        }
       node=head;
       while(n>1){
           node=node.next;
           n--;
       }
       node.next=node.next.next;
       return head;
    }
}