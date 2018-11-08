#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<malloc.h>

typedef struct node
{
       int x;
       struct node *left,*right;
       int thread;
       }node;
       
       node *tree=NULL;
       node *insert(node *,node *,node *);
       node *create();
       void inorder(node *);
       
       node *create()
       {
            node *p;
            int num;
            printf("enter no of elements,press -1 to terminate ");
            scanf("%d",&num);
            while(num!=-1)
            {
                p=(node *)malloc(sizeof(node));
                p->x=num;
                p->left=p->right=NULL;
                p->thread=0;
                tree=insert(tree,p,NULL);
                printf("\n enter next element");
                scanf("%d",&num);
                }
                return tree;
                }
                
                
                node *insert(node *tree,node *p,node *r)
                {   
                    if(tree==NULL)
                    {
                       tree=p;
                       if(r!=NULL)
                       { 
                         tree->right=r;
                         tree->thread=1;
                         }
                         }
                         else if(p->x<tree->x)
                         tree->left=insert(tree->left,p,tree);
                         
                         else if(tree->thread==1)
                         {
                              tree->right=insert(NULL,p,r);
                              tree->thread=0;
                              }
                              
                              else
                              
                              tree->right=insert(tree->right,p,r);
                              return tree;
                              }
                              
                              void inorder(node *tree)
                              {
                                   node *p=tree;node *prev;
                                   do
                                   {
                                        while(p!=NULL)
                                        {
                                              prev=p;
                                              p=p->left;
                                              }
                                              if(prev!=NULL)
                                              {
                                                   printf("%d",prev->x);
                                                   p=prev->right;
                                                   while(prev!=NULL && prev->thread!=0)
                                                   {
                                                        printf("%d",prev->x);
                                                        prev=p;
                                                        p=p->right;
                                                        }
                                                        }
                                                        }while(p!=NULL);
                                                        }
                                                        
                                                        int main()
                                                        {
                                                            node *tree=NULL;
                                                            create();
                                                            inorder(tree);
                                                            getch();
                                                            return 0;
                                                            }
                                                            
                                                            
                                                        
                                                                                             
                                           
                     
                         
       
