//  https://leetcode.com/problems/remove-nth-node-from-end-of-list/


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode s=new ListNode();
        s.next=head;
        ListNode a=s;
        ListNode b=s;
        for(int i=0;i<n;i++){
            a=a.next;
        }
        while(a.next!=null){
            a=a.next;
            b=b.next;
        }
        b.next=b.next.next;
        return s.next;
        
    }
}
