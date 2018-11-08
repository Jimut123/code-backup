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
void odd_even(node*);
void sort(node*);
void disp_rev(node*,int);
void rev(node*,int);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      odd_even(start);
      sort(start);
      disp(start);
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
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void odd_even(node* start)
{
     printf("\n");
     node* start1;
     start1=start;
     int c=0;
     while(start1)
     {
                  c++;
                  if(start1->k%2==0)
                  printf("\n%d is EVEN",start1->k);
                  else
                  printf("\n%d is ODD",start1->k);
                  start1=start1->next;
     }
     node_count(c);
     disp_rev(start,c);
}
void node_count(int c)
{
     printf("\n\nNumber of nodes : %d\n",c);
}
void sort(node* start)
{
     printf("\n\nAfter Sorting,");
     node *start1,*start2;
     start1=start;
          int t=0;
     while(start1->next)
     {
                        start2=start1->next;
                  while(start2)
                  {
                               if(start1->k>start2->k)
                               {
                                                            t=start1->k;
                                                            start1->k=start2->k;
                                                            start2->k=t;
                               }
                               start2=start2->next;
                  }
                  start1=start1->next;
     }
}
void disp_rev(node* start, int c)
{
     printf("\nYour Linked List in Reverse Order :\n");
     node* start1;
     int i,j;
     for(i=c;i>=1;i--)
     {
                      j=0;
                      start1=start;
                      while(start1)
                      {
                                   j++;
                                   if(j==i)
                                   {
                                           printf("%d, ",start1->k);
                                           break;
                                   }
                                   start1=start1->next;
                      }
     }
     rev(start,c);
}
void rev(node* start, int c)
{
     printf("\n\nAfter completely Reversing,");
     node *start1,*start2;
     int i,j,t,f,p1=0,p2;
     for(i=1,j=c;i<=c/2;i++,j--)
     {
                                p1=0;
                                start1=start;
                                while(start1)
                                {
                                             p1=p1+1;
                                             if(p1==i)
                                             {
                                                      p2=f=0;
                                                      start2=start;
                                                      while(start1)
                                                      {
                                                                   p2=p2+1;
                                                                   if(p2==j)
                                                                   {
                                                                            t=start1->k;
                                                                            start1->k=start2->k;
                                                                            start2->k=t;
                                                                            f=1;
                                                                            break;
                                                                   }
                                                                   start2=start2->next;
                                                      }
                                             }
                                             if(f==1)
                                             break;
                                             start1=start1->next;
                                }
     }
     disp(start);
}
