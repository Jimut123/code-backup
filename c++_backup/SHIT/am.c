#include<stdio.h>

struct list
{
    int x;
    struct list * next;
};
typedef struct list node;
node *push(node*);
node *pop(node*);
void show(node*);
int main()
{
    node *top;
    //top=(node*)malloc(sizeof(node));
    top=push(top);
    top=pop(top);
    show(top);
    return 0;
}

node *push(node *top)
{
    node *head1;
    head1=(node*)malloc(sizeof(node));
    scanf("%d",&head1->x);
    head1->next=top;
    top = head1;
    return top;
}
node *pop(node *top)
{
    if(top=NULL)
    {
        printf("UNDERFLOW");
        return;
    }
    else
    {
      printf("\n%d",top->x);
      return top->next;
    }
}
void show(node *top)
{
    node * head1;
    head1=top;
    while(head1!=NULL)
    {
        printf("%d",head1->next);
        head1=head1->next;
    }
}
