#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#include<stdlib.h>

typedef struct node
{
   int row;
   int col;
   int x;
   struct node *next;
}node;     

node *create(node *);
void show(node *);


int a[100][100],b[100][100],i=0,r=0,h=0,j=0,k=0,n;

 printf("enter length of array");
 scanf("%d",&n);
 
 for(i=0;i<n;i++)
 {
   for(j=0;j<n;j++)
   {
      printf("enter elements %d",i+1);
      scanf("%d",&a[i][j]);
      }
      }
      
   for(i=0;i<n;i++)
   {
     for(j=0;j<n;j++)
     {
       if(a[i][j]==0)
       h++;
       else
       r++;
       }
       }
       
       if(h>(n*n)/2.0)
       printf("sparse matrix");
       else
       printf("not sparse matrix");
       
       
       
       
   node *create(node *head)
   {
        node *p;
        printf("enter 
        head=(node *)malloc(sizeof(node));
        head->row=n;
        head->col=n;
        head->x=r;
        
        for(i=2;i<=r;i++)
        {p=(node *)malloc(sizeof(node));
         p->row=
         
                           
       
       
       
       
       
       
       
       
       
       
       
                                                                 
