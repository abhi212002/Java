//  https://leetcode.com/problems/merge-two-sorted-lists

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return mergell(list1,list2);
    }
  
    public ListNode mergell(ListNode l1, ListNode l2)
    {
        if(l1 == null)
        {
        return l2;  
        }
        if(l2==null)
        {
            return l1;
        }
        if(l1.val>l2.val)
        {
            return new ListNode(l2.val,mergell(l2.next, l1));
        }
        else
        {
            return new ListNode(l1.val, mergell(l2, l1.next));  
        }
    }
}
