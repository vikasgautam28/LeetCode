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
    public ListNode partition(ListNode head, int x) {
        
        
        if(head==null || head.next==null) {
            return head;
        }
            
        else {
            
            ListNode left=null;
            ListNode right=null;
            ListNode leftHead=null;
            ListNode rightHead=null;
            if(head.val<x) {
                
                left = new ListNode(head.val);
                leftHead=left;
            }
            else {
                
                right = new ListNode(head.val);
                rightHead=right;
            }
            
            head=head.next;
            
            while(head!=null) {
                
                if(head.val<x) {
                
                    ListNode node = new ListNode(head.val);
                    
                    if(left==null) {
                        left=node;
                        leftHead=left;
                    }
                    else {
                        left.next=node;
                        left=left.next;
                    }
                    
                }
                else {
                
                    ListNode node = new ListNode(head.val);
                    
                    if(right==null) {
                        right=node;
                        rightHead=right;
                    }
                    else {
                        right.next=node;
                        right=right.next;
                    }
                }
                
                head=head.next;
                
            }
            
            if(left==null)
            {
                return rightHead;
            }
            else if(right==null)
            {
                return leftHead;
            } else {
                
                left.next=rightHead;
                
                return leftHead;
            }
            
            
        }
    }
}