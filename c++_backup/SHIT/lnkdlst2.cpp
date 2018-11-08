#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
node* insert(node*);
void disp(node*);
void node_count(int);
void distribute(node*);
int prime1(int);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      distribute(start);
      getch();
}
node* insert(node* start)
{
      node* start1;
      start1=start;
      char ch='y';
      while(ch=='y' || ch=='Y')
      {
                    printf("\nEnter data :\n");
                    scanf("%d",&start1->k);
                    fflush(stdin);
                    printf("\nEnter another :\n");
                    scanf("%c",&ch);
                    if(ch=='y' || ch=='Y')
                    {
                               start1->next=(node*)malloc(sizeof(node));
                               start1=start1->next;
                    }
      }
      start1->next=NULL;
      return start;
}
void disp(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  //if(start1->next->next!=NULL)
                  //printf("%d, ",start1->k);
                  //else
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void distribute(node* start)
{
     node* start1;
     start1=start;
     node *even,*e,*odd,*o,*prime,*p;
     e=even=(node*)malloc(sizeof(node));
     p=prime=(node*)malloc(sizeof(node));
     o=odd=(node*)malloc(sizeof(node));
     while(start1)
     {
                       if(start1->k%2==0)
                       {
                                         
                                         even->k=start1->k;
                                         even->next=(node*)malloc(sizeof(node));
                                         even=even->next;
                       }
                       else
                       if(prime1(start1->k)==0)
                       {
                                              
                                              prime->k=start1->k;
                                              prime->next=(node*)malloc(sizeof(node));
                                              prime=prime->next;
                       }
                       else
                       {
                           odd->k=start1->k;
                           odd->next=(node*)malloc(sizeof(node));
                           odd=odd->next;
                       }
                       start1=start1->next;
     }
     odd->k=0;
     odd->next=NULL;
     even->k=0;
     even->next=NULL;
     prime->k=0;
     prime->next=NULL;
     printf("\nEVEN list :\n");  
     disp(e);
     printf("\nODD list :\n");
     disp(o);
     printf("\nPRIME list :\n");
     disp(p);
}
int prime1(int n)
{
    int i,f=0;
    for(i=2;i<n;i++)
    if(n%i==0)
    {
              f=1;
              break;
    }
    if(f==0)
    return 0;
    else
    return 1;
}
