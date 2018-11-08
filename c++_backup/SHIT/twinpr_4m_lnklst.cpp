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
int prime(int);
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
int prime(int n)
{
    int i,f=0;
    for(i=2;i<n;i++)
    if(n%i==0)
    {
              f=1;
              break;
    }
    if(f==0)
    return 0;
    else
    return 1;
}
void xplore(node* start)
{
     node* start1=start,*str;
     printf("\n\nList of twin primes :");
     while(start1)
     {
                  if(prime(start1->k)==0)
                  {
                                         str=start;
                                         while(str)
                                         {
                                                   if(prime(str->k)==0)
                                                   if(start1->k-str->k==2 || start1->k-str->k==-2)
                                                   printf("\n%d, %d,",start1->k,str->k);
                                                   str=str->next;
                                         }
                  }
                  start1=start1->next;
     }
}
