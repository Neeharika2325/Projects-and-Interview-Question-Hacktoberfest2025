struct ListNode *detectCycle(struct ListNode *head)
{
    struct ListNode *fast=head,*slow=head,*ptr=head;
    while(fast!=NULL && fast->next!=NULL)
    {
        slow=slow->next;
        fast=fast->next->next;
    if(fast==slow)
    {
        while(slow!=ptr)
        {
            ptr=ptr->next;
            slow=slow->next;
        }
        return slow;
    }
    }
    return NULL;
}
