#include<conio.h>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>
struct list
{
       char k[100];
       struct list *next;
};
typedef struct list node;
node* insert(node*);
void disp(node*);
int vcount(char[]);
void vsort(node*);
main()
{
      node* start;
      start=(node*)malloc(sizeof(node));
      start=insert(start);
      disp(start);
      vsort(start);
      printf("\n\nAfter vowel sorting,");
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
                    fflush(stdin);
                    printf("\nEnter data :\n");
                    gets(start1->k);
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
void vsort(node* start)
{
      node* start1,*str1;
      char c[100];
      for(start1=start;start1;start1=start1->next)
      for(str1=start1->next;str1;str1=str1->next)
      if(vcount(start1->k)>vcount(str1->k))
      {
                           strcpy(c,start1->k);
                           strcpy(start1->k,str1->k);
                           strcpy(str1->k,c);
      }
}
int vcount(char s[])
{
    int v=0,i;
    for(i=0;s[i];i++)
    if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || s[i]=='A' || s[i]=='E' || s[i]=='I' || s[i]=='O' || s[i]=='U')
    v++;
    return v;
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
