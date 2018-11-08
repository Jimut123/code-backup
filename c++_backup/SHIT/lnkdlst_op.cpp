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
void test(node*);
node* start,*str,*str1;
main()
{
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      str=str1=start;
      test(str1);
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
     int c=0;
     while(start1)
     {
                  c++;
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
int i=0,n=0;
void test(node* str1)
{
     if(start==NULL)
     {
                    i=n/2;
                    n=0;
                    test(str);
     }
     else
     {
         n=n+1;
         if(i>0 && n==i)
         {
                printf("\nMiddle node position= %d\nMiddle node value= %d",i,start->k);
                return;
         }
         test(str1->next);
     }
}
