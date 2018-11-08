#include<stdio.h>
#include<malloc.h>
struct NODE
{
int Info;
struct NODE *Left_Child;
struct NODE *Right_Child;
};
struct NODE *Create_Tree(int,struct NODE*);
void Output(struct NODE*,int);
//Function to create a tree
struct NODE *Create_Tree(int Info,struct NODE *Node)
{
if(Node==NULL)
{
Node=(struct NODE*)malloc(sizeof(struct NODE));
Node->Info=Info;
Node->Left_Child=NULL;
Node->Right_Child=NULL;
return(Node);
}
//test for the left child
if(Node->Info>=Info)
Node->Left_Child=Create_Tree(Info,Node->Left_Child);
else
Node->Right_Child=Create_Tree(Info,Node->Right_Child);
return (Node);
}
/*Output function*/
void Output(struct NODE *T,int Level)
{
int i;
if(T)
{
Output(T->Right_Child,Level+1);
printf("\n");
//delay(350);
for(i=0;i<Level;i++)
printf(" ");
//delay(350);
printf("%d",T->Info);
printf("\n");
//delay(350);
Output(T->Left_Child,Level+1);
}
}
//Function Main
void main()
{
int info;
char choice;
struct NODE *T=(struct NODE*)malloc(sizeof(struct NODE*));
T=NULL;
clrscr();
printf("\nInput Choice 'b' to break :");
choice=getchar();
while(choice!='b')
{
printf("\n Input information of the Node :");
scanf("%d",&info);
T=Create_Tree(info,T);
printf("\nTree is");
Output(T,1);
printf("\nInput choice b to break :");
choice=getchar();
}
}