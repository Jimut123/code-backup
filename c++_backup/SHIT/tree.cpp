#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<malloc.h>

typedef struct node
{
     int data;
     struct node *next;
     }node;
     
     typedef struct tnode
     {
          int x;
          struct tnode *left,*right;
          }tnode;
          
      node *createlist(node *);
      void show(node *);
      tnode *createtree(tnode *,int);
      void inorder(tnode *);
      tnode *listtotree(node *,tnode *);
      
      node *createlist(node *head)
      {
         int n,i;
         printf("enter number of nodes");
         scanf("%d",&n);
         node *p;
         p=head;
          for(i=1;i<=n;i++)
         {  scanf("%d",&p->data);
            p->next=(node *)malloc(sizeof(node));
            p=p->next;
                      }
                      
                      p->next=NULL;
                      return head;
                      }
                      
          void show(node *head)
          {
             node *p;
             p=head;
             while(p!=NULL)
             {
                printf("%d",p->data);
                p=p->next;
                }
                }
                
                
          tnode *createtree(tnode *head1,int v)
          {   //tnode *p;
             if(head1==NULL)
             { head1=(tnode *)malloc(sizeof(tnode));
               head1->x=v;
               head1->left=NULL;
               head1->right=NULL;
               return head1;
               }
               else
               if(v>=head1->x) 
               {
                              return(createtree(head1->right,v)); 
                              }
                              else
                                return(createtree(head1->left,v));  
                                
                                }
                                                       
                   
           
             void inorder(tnode* head1)
            {
                 if(head1!=NULL)
                 {
                   inorder(head1->left);
                   printf("\n %d",head1->x);
                    inorder(head1->right); 
                    }
                    else
                    return ;
                    } 
                    
                    tnode *listtotree(node *head,tnode *head1)
                    {
                         
                      node *p;
                      p=head;
                      while(p!=NULL)
                      {
                          head1=createtree(head1,p->data);
                          p=p->next;
                          }
                          return head1;
                          }
                          
                         
                         int main()
                        {node *head;
                          head=(node *)malloc(sizeof(node));
                          tnode *head1;
                          //head1=(tnode *)malloc(sizeof(tnode));
                          int ch;
                          do
                          {
                          printf("1 for createlist");
                          printf("2 for print");
                          printf("3 for listtotree");
                          printf("4 for inorder");
                          printf("5 for exit");
                          
                          printf("enter user's choice");
                          scanf("%d",&ch);
                          switch(ch)
                          {
                              case 1:head=createlist(head);
                                     break;
                              case 2:show(head);
                                     break;
                              case 3:head1=listtotree(head,head1);
                                     break;
                              case 4:inorder(head1);
                                     break;
                              case 5:printf("exit");
                                      
                                     break;
                              
                              default:printf("enter wrong choice");
                              }
                              }while(ch!=5);
                              getch();
                              return 0;
                              }
                                                                 
                                           
                          
                          
                                    
                                     
