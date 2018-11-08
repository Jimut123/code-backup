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
int c=0;
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
                  c++;
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void xplore(node* start)
{
     node* start1,*str,*str1,*str2;;
     str=(node*)malloc(sizeof(node));
     str1=str;
     int t=0,m=0,n=10;
     while(t!=c)
     {
                start1=start;
                while(start1)
                {
                             if(start1->k>=m && start1->k<n)
                             {
                                            t++;
                                            str1->k=start1->k;
                                            str2=str1;
                                            str1->next=(node*)malloc(sizeof(node));
                                            str1=str1->next;
                             }
                             start1=start1->next;
                }
                m=n;
                n=n*10;
     }
     str2->next=NULL;
     disp(str);
}
