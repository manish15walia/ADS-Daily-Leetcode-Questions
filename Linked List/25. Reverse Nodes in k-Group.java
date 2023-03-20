/*  https://leetcode.com/problems/reverse-nodes-in-k-group/description/ */

class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
        if(head==NULL || k==1)return head;
        ListNode *dummy = new ListNode(0);
        dummy->next=head;

        ListNode *curr = dummy , *nex = dummy , *prev = dummy;

        int count = 0;
        while(curr->next!=NULL){  //to find length
            curr = curr->next;
            count++;
        }
        while(count>=k){
            curr = prev->next;
            nex = curr->next;
            for(int i=1;i<k;i++){
                curr->next = nex->next;
                nex->next = prev->next;
                prev->next=nex;
                nex=curr->next;
            }
            prev=curr;
            count-=k;
        }
        return dummy->next;

    }
};
