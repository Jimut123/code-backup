#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct list
{
       int k;
       struct list *next;
};
typedef struct list node;
node* insert(node*,int);
void disp(node*);
void pal(node*,node*);
void input();
int n,m;
main()
{
      node* start1,*start2;
      start1=(node*)malloc(sizeof(node));
      start2=(node*)malloc(sizeof(node));
      input();
      start1=insert(start1,n);
      start2=insert(start2,m);
      disp(start1);
      disp(start2);
      pal(start1,start2);
      getch();
}
void input()
{
     printf("\nEnter the number for palinrome check :\n");
     scanf("%d",&n);
     m=n;
     int s=0;
     while(m>0)
     {
               s=(s*10)+(m%10);
               m=m/10;
     }
     m=s;
}
node* insert(node* start, int i)
{
      node* str;
      str=start;
      int j;
      while(i>0)
      {
                j=i%10;
                str->k=j;
                i=i/10;
                if(i>0)
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
     printf("\n\nYour Linked List :\n");
     node* start1;
     start1=start;
     while(start1)
     {
                  printf("%d, ",start1->k);
                  start1=start1->next;
     }
}
void pal(node* start1, node* start2)
{
     node* str1=start1,*str2=start2;
     int f=0;
     while(str1)
     {
                if(str1->k!=str2->k)
                {
                                    f=1;
                                    break;
                }
                str2=str2->next;
                str1=str1->next;
     }
     if(f==0)
     printf("\n\nNumber is palindrome.......\n");
     else
     printf("\n\nNumber is NOT palindrome!!!!!!!!\n");
}
