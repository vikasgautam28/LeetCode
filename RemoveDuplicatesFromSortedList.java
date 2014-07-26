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
    public ListNode deleteDuplicates(ListNode head) {
     ListNode newhead=head;
     if(head==null || head.next==null)
     return newhead;
     else
     {
         while(head.next!=null)
         {
             if(head.val==head.next.val)
             {
                 if(head.next.next!=null)
                 {
                    head.next=head.next.next;
                 }
                 else
                 {
                    head.next=null;
                 }
             }
             else
             {
                 head=head.next;
             }
         }
         
         return newhead;
     }
     
     
        
    }
}