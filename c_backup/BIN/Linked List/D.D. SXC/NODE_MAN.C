void insert(int k)
{
NODE *x=(NODE *)malloc(sizeof(NODE));
*y=head;
x->key=k;
x->next=NULL;
if(!head)
{
head=x;
return;
}
while(y->next)
y=y->next;
y->next=x;
}