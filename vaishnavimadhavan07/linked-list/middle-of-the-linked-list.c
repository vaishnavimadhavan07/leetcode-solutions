/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* ptr1 = head;
    struct ListNode* ptr2 = head;

    while (ptr2 != NULL && ptr2->next != NULL){
        ptr1 = ptr1->next;
        ptr2 = ptr2->next->next;
    }
    return ptr1;
}
