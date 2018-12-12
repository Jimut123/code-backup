#include<conio.h>
#include<stdlib.h>
#include<stdio.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
node* insert(node*);
void disp(node*);
node* op(node*);
int c;
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      start=op(start);
      printf("\n\nAfter operating,");
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
node* op(node* start)
{
      node* start1,*str1;
      int m=c/2,t,a[c],n=m-1;
      for(start1=start;start1;start1=start1->next)
      for(str1=start1->next;str1;str1=str1->next)
      if(start1->k<str1->k)
      {
                           t=start1->k;
                           start1->k=str1->k;
                           str1->k=t;
      }
      start1=start;
      t=0;
      a[m++]=start1->k;
      start1=start1->next;
      while(start1)
      {
                   if(t==0)
                   {
                           a[m++]=start1->k;
                           t=1;
                   }
                   else
                   {
                       a[n--]=start1->k;
                       t=0;
                   }
                   start1=start1->next;
      }
      t=1;
      for(t=1;t<m;t++)
      printf("\n%d, ",a[t]);
      start1=start;
      disp(start1);
      while(start1)
      {
                   printf("\n%d, ",a[t]);
                   start1->k=a[t++];
                   start1=start1->next;
      }
      return start;
}
void disp(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     c=0;
     while(start1)
     {
                  c=c+1;
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
     
}
