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
int prime(int);
node* op(node*);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      start=op(start);
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
int prime(int n)
{
    int i,f=0;
    for(i=2;i<n;i++)
    if(n%i==0)
    {
              f=1;
              break;
    }
    return f;
}
node* op(node* start)
{
      node* str=start,*start1=start,*str1;
      int f=0;
      while(start1)
      {
                   if(prime(start1->k)==0)
                   f=f+1;
                   if(f>0 && f%2==0)
                   {
                          str->next=start1->next;
                          start1->next=NULL;
                          start1=start;
                          disp(str1);
                   }
                   if(f%2==0)
                   str=str->next;
                   else
                   str1=start1;
                   start1=start1->next;
      }
}
void disp(node* start)
{
     printf("\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%s, ",start1->k);
                  start1=start1->next;
     }
     
}
