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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dum=new ListNode(1);
        ListNode a=dum;
        int c=0;
        while(c!=0||l1!=null||l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int s=x+y+c;
            c=s/10;
            a.next=new ListNode(s%10);
            a=a.next;
            if(l1!=null){
                l1=l1.next;
            }if(l2!=null){
                l2=l2.next;
            }
            

        }
        return dum.next;

        
    }
}