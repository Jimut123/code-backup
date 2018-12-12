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
node* sort(node*);
void bsearch(node*);
int node_val(node*,int);
int c=0;
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      start=sort(start);
      disp(start);
      bsearch(start);
      getch();
}
node* insert(node* start)
{
      node* start1;
      start1=start;
      char ch='y';
      while(ch=='y' || ch=='Y')
      {
                    c++;
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
     printf("\n\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
node* sort(node* start)
{
     node* start1,*str;
     int t;
     for(start1=start;start1;start1=start1->next)
     for(str=start1->next;str;str=str->next)
     if(start1->k>str->k)
     {
                         t=start1->k;
                         start1->k=str->k;
                         str->k=t;
     }
     return start;
}
void bsearch(node* start)
{
     int s,l=1,h=c,m=(l+h)/2,f=0;
     printf("\n\nEnter search data :\n");
     scanf("%d",&s);
     while(l<=h)
     {
               if(s==node_val(start,m))
               {
                                       f=1;
                                       break;
               }
               else
               if(s<node_val(start,m))
               h=m-1;
               else
               if(s>node_val(start,m))
               l=m+1;
               m=(l+h)/2;
     }
     if(f==1)
     printf("\nData found in position : %d\n",m);
     else
     printf("\nData not found!!!!!!!!!!");
}               
int node_val(node* start, int n)
{
    node* start1=start;
    int t=0;
    while(start1)
    {
                 t++;
                 if(t==n)
                 return start1->k;
                 start1=start1->next;
    }
}
