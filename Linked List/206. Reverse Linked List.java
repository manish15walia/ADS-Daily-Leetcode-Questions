/* https://leetcode.com/problems/reverse-linked-list/description/*/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;

            prev=cur;
            cur=temp;
        }
        return prev;
        
    }
}
