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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        ListNode temp2=head;
        if(head==null)
            return head;
            
        else{
            int l=1;
            while(temp.next!=null)
            {
                l++;
                temp=temp.next;
            }
            
            if(l==1 && n==1)
            {
                return null;
            }
            else if(l-n==0)
            {
                return head.next;
            }
            
            else
            {
                int iter=l-n;
                while(iter>1)
                {
                    temp2=temp2.next;
                    iter--;
                }
                
                    temp2.next=temp2.next.next;
            }
            
        }
        
        return head;
            
        
        
        
    }
}