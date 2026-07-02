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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=head;
        while(head!=null && head.next!=null){
            return head;
        }
        while(t!=null && t.next!=null){
            if(t.next.val==val){
                t.next=t.next.next;
            }else{
                t=t.next;
            }
        }
        return head;
        
    }
}