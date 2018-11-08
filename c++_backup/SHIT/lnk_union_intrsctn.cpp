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
void union_link(node*,node*);
void intersection_link(node*,node*);
main()
{
      node* start1,*start2;
      start1=(node*)malloc(sizeof(node));
      printf("\nInput for 1st list :\n");
      start1=insert(start1);
      start2=(node*)malloc(sizeof(node));
      printf("\n\nInput for 2nd list :\n");
      start2=insert(start2);
      printf("\nYour 1st list :");
      disp(start1);
      printf("\n\nYour 2nd list :");
      disp(start2);
      union_link(start1,start2);
      intersection_link(start1,start2);
      getch();
}
node* insert(node* start)
{
      node* str;
      str=start;
      char ch='y';
      while(ch=='y' || ch=='Y')
      {
                    printf("\nEnter data :\n");
                    scanf("%d",&str->k);
                    fflush(stdin);
                    printf("\nEnter another :\n");
                    scanf("%c",&ch);
                    if(ch=='y' || ch=='Y')
                    {
                               str->next=(node*)malloc(sizeof(node));
                               str=str->next;
                    }
      }
      str->next=NULL;
      return start;
}
void disp(node* start)
{
     printf("\nYour Linked List :\n");
     node* str;
     str=start;
     while(str)
     {
                  printf("%d, ",str->k);
                  str=str->next;
                  getch();
     }
}
void intersection_link(node* start1, node* start2)
{
     node *str1=start1,*str=start2,*str2,*t;
     node* intr=(node*)malloc(sizeof(node));
     t=intr;
     int f=0,c=0;
     while(str1)
     {
                str2=str;
                f=0;
                while(str2)
                {
                           if(str2->k==str1->k)
                           {
                                               f=1;
                                               break;
                           }
                           str2=str2->next;
                }
                if(f==0)
                t->k=str1->k;
                //printf("%d, ",t->k);
                //if(str2->next!=NULL || c==0)
                //{
                                    t->next=(node*)malloc(sizeof(node));
                                    t=t->next;
                //}
                str1=str1->next;
                /*if(str1==NULL && c==0)
                {
                              str=start1;
                              str1=start2;
                              c=1;
                }*/
     }
     f=0;
     str=start1;
     str1=start2;
     while(str1)
     {
                str2=str;
                while(str2)
                {
                           if(str2->k==str1->k)
                           {
                                               f=1;
                                               break;
                           }
                           str2=str2->next;
                }
                if(f==0)
                t->k=str1->k;
                if(str2->next!=NULL)// || c==0)
                {
                                    t->next=(node*)malloc(sizeof(node));
                                    t=t->next;
                }
                str1=str1->next;
     }
     t->next=NULL;
     printf("\n\nYour intersection list :");
     disp(intr);
}
void union_link(node* start1, node* start2)
{
     node *str1=start1,*str2,*t;
     int f=0;
     while(str1)
     {
                str2=start2;
                f=0;
                while(str2)
                {
                           if(str2->k==str1->k)
                           {
                                               f=1;
                                               break;
                           }
                           t=str2;
                           str2=str2->next;
                }
                if(f==0)
                {
                        t->next=(node*)malloc(sizeof(node));
                        t=t->next;
                        t->k=str1->k;
                        t->next=NULL;
                }
                str1=str1->next;
     }
     printf("\n\nYour union list :");
     disp(start2);
}
