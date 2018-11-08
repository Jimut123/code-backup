#include<stdio.h>
#include<conio.h>
#include<malloc.h>
#define MAX 10
int cq[MAX];
int rear=-1,front=-1;
void insert()
{
     int d;
     //printf("\n %d,%d",front,rear);
     printf("\n Enter data:");
     scanf("%d",&d);
     if(((rear==MAX-1)&&(front==0))||(rear+1==front))
     {
     printf("\n\t Queue overflow...");
     return;
     }
     if(front==-1)
     {
                  front=0;
                  rear=0;
                  }
                  else
                  {
                  if(rear==MAX-1)
                      rear=0;
                      else 
                      rear=rear+1;
                      }
                      cq[rear]=d;
                      for(int i=front;i<=rear;i++)
                      printf("\n%d",cq[i]);
                      }
     void del()
     {
          if(front==-1)
          {
                       printf("\n\tQUEUE UNDERFLOW...");
                       return;
                       }
          printf("\ndeleted element:%d",cq[front]);
          if(front==rear)
          {
                         front=-1;
                         rear=-1;
                         }
          else
          {
              if(front==MAX-1)
              front=0;
              else
              front=front+1;
              }
              }
          void display()
          {
               int fpos,rpos;
               fpos=front;
               rpos=rear;
               if(fpos<=rpos)
               {
               while(fpos<=rpos)
               {
               printf("\t %d",cq[fpos]);
               fpos++;
               }
               }
          else
          {
              while(fpos<=MAX-1)
          {
              printf("\t %d",cq[fpos]);
              fpos++;
              }
              
              fpos=0;
          while(fpos<=rear)
          {
          printf("\t %d",cq[fpos]);
          fpos++;
          }
          }
          }
          int main()
          {
          int choice;
          //clrscr();
          while(1)
          {
                  printf("\n ENTER CHOICE...\n 1.Insert\n 2.Delete\n3.Display\n4.Exit\n5.Clear Screen\n\n>");
                  scanf("%d",&choice);
                  switch(choice)
                  {
                  case 1:insert();
                  break;
                  case 2:del();
                  break;
                  case 3:display();
                  break;
                  case 4:exit(0);
                  //case 5:clrscr();
                  //break;
                  }
                  }
                  return 0;
                  }
                  
                      
