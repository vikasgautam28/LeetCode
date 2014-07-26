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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null || l2==null)
            return l1==null? l2:l1;
        else
        {
            ListNode newList;
            
            if(l1.val<=l2.val)
            {
                newList=new ListNode(l1.val);
                l1=l1.next;
            }
            else
            {
                newList=new ListNode(l2.val);
                l2=l2.next;
            }
            ListNode newHead=newList;
            while(l1!=null && l2!=null)
            {
                ListNode newNode;
                if(l1.val<=l2.val)
                {
                    newNode=new ListNode(l1.val);
                    l1=l1.next;
                }
                else
                {
                    newNode=new ListNode(l2.val);
                    l2=l2.next;
                }
                
                newList.next=newNode;
                newList=newList.next;
            }
            
            while(l1!=null)
            {
                ListNode newNode=new ListNode(l1.val);
                l1=l1.next;
                newList.next=newNode;
                newList=newList.next;
            }
            
            while(l2!=null)
            {
                ListNode newNode=new ListNode(l2.val);
                l2=l2.next;
                newList.next=newNode;
                newList=newList.next;
            }
            
            return newHead;
        }
        
    }
}