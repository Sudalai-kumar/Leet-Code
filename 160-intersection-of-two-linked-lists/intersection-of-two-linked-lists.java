/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        ListNode tempA=headA;
        while(tempA!=null){
            tempA=tempA.next;
            l1++;
        }
        int l2=0;
        ListNode tempB=headB;
        while(tempB!=null){
            tempB=tempB.next;
            l2++;
        }
        int dif=l1-l2;
        ListNode res=null;
        if(dif<0){
            tempA=headA;
            tempB=headB; 
            while(dif<0){
                tempB=tempB.next;
                dif++;
            }
            while(tempA!=null||tempB!=null){
                if(tempA==tempB){
                    res=tempA;
                    return res;
                }
                tempA=tempA.next;
                tempB=tempB.next;
            }
        }else{
            tempA=headA;
            tempB=headB; 
            while(dif>0){
                tempA=tempA.next;
                dif--;
            }
            
            while(tempA!=null||tempB!=null){
                if(tempA==tempB){
                    res=tempA;
                    return res;
                }
                tempA=tempA.next;
                tempB=tempB.next;
            }
        }
        return res;
    }
}