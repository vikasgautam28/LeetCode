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
    public ListNode swapPairs(ListNode head) {
     
     if(head==null)
     return head;
     else if(head.next==null)
     {
         return head;
     }
     else
     {
         ListNode temp=new ListNode(head.val);
         if(head.next.next!=null)
         temp.next=swapPairs(head.next.next);
         head=head.next;
         head.next=temp;
         return head;
     }
        
    }
}