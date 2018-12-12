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
void xplore(node*);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      xplore(start);
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
     printf("\n\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void xplore(node* start)
{
     node* start1=start,*st1,*st2,*str,*str1,*str2,*str3;
     str=(node*)malloc(sizeof(node));
     str3=(node*)malloc(sizeof(node));
     str1=str;
     str2=str3;
     while(start1)
     {
                  if(start1->k%2==0)
                  {
                                    str2->k=start1->k;
                                    st2=str2;
                                    if(start1->next!=NULL)
                                    {
                                                          str2->next=(node*)malloc(sizeof(node));
                                                          str2=str2->next;
                                    }
                  }
                  else
                  {
                      str1->k=start1->k;
                      st1=str1;
                      if(start1->next!=NULL)
                      {
                                            str1->next=(node*)malloc(sizeof(node));
                                            str1=str1->next;
                      }
                  }
                  start1=start1->next;
     }
     st2->next=NULL;
     st1->next=str3;
     disp(str);
}
