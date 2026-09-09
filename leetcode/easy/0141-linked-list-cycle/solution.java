/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode f=head.next;
        ListNode s=head;
        while(s!=null && f!=null && f.next!=null){
            if(f==s){
                return true;
            }
            s=s.next;
            f=f.next.next;

        }
        return false;
        
    }
}