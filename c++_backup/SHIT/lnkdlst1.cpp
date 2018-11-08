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
void disp1(node*);
void disp2(node*);
void node_count(int);
node* rev(node*);
void split(node*,int);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp2(start);
      disp1(rev(start));
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
void disp1(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     int c=0;
     while(start1)
     {
                  c++;
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
     node_count(c);
     split(start,c);
}
void disp2(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void node_count(int c)
{
     printf("\n\nNumber of nodes : %d\n",c);
}
node* rev(node* start)
{
     node *start1,*start2;
     start1=NULL;
     while(start!=NULL)
     {
                       start2=(node*)malloc(sizeof(node));
                       start2->k=start->k;
                       start2->next=start1;
                       start1=start2;
                       start=start->next;
     }
     return start1;
}
void split(node* start, int c)
{
     int n=0;
     printf("\nEnter the position from where you want to split the list :\n");
     scanf("%d",&n);
     int i;
     node *start1=start;
     node* start2;
     for(i=1;i<=c;i++)
     {
                      if(i==n)
                      break;
                      start1=start1->next;
     }
     start2=start1->next;
     start1-> next=NULL;
     disp2(start);
     disp2(start2);
}
