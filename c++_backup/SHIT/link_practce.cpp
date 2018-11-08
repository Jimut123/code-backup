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
void op(node*);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      op(start);
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
void op(node* start)
{
      node* str,*str1,*start1=start;
      int i,j,k,t=0,a[100];
      printf("\n\nEnter your choices from among the linked list.....\n");
      char ch='y';
      while(ch=='y' || ch=='Y')
      {
                    printf("\nEnter the chosen data :\n");
                    scanf("%d",&a[t++]);
                    fflush(stdin);
                    printf("\nEnter another ?\n");
                    scanf("%c",&ch);
      }
      for(i=0;i<t;i++)
      {
                      k=0;
                      while(start1)
                      {
                                   if(a[i]==start1->k)
                                   {
                                                      k=1;
                                                      break;
                                   }
                                   start1=start1->next;
                      }
                      start1=start;
                      if(k==0)
                      {
                              printf("\nEnter the choices from among the linked list only!!!!!!!!\n");
                              op(start);
                      }
      }
      for(i=0;i<t;i++)
      for(j=i+1;j<t;j++)
      if(a[i]<a[j])
      {
                   k=a[i];
                   a[i]=a[j];
                   a[j]=k;
      }
      str=(node*)malloc(sizeof(node));
      str1=str;
      for(i=0;i<t;i++)
      {
                      str->k=a[i];
                      if((i+1)!=t)
                      {
                                str->next=(node*)malloc(sizeof(node));
                                str=str->next;
                      }
      }
      str->next=NULL;
      disp(str1);
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
