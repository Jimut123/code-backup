#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<stdio.h>
#include<dos.h>
#include<conio.h>
#include<stdlib.h>
char st[100]="This project is based on lighting...\n//creator --- aka Jimut";
int c=0;
void refresh(int a[100][100],int);
void display(int a[100][100],int);
void delayp1();
void disp1();
void insert(int a[100][100],int);
void main()
{
int i,a[100][100],n;
clrscr();
printf("Enter the size of one side :\n");
scanf("%d",&n);
for(i=0;;i++)
{
int l=strlen(st);
clrscr();
refresh(a,n);
insert(a,n);
display(a,n);
while (kbhit())
exit(1);
disp1(l);
delayp1();
}
//getch();
}
void delayp1()
{
int i,j;
//clrscr();
for(i=0;i<6600;i++)
{
for(j=0;j<6000;j++);
}
}
void insert(int a[100][100],int n)
{
int i,k,m,p;
for(i=0;i<=(int)n/2+1;i++)
{
p=(int)random(2);
k=(int)random(n);
m=(int)random(n);
if(p==1)
a[k][m]=1;
else if(p==0)
a[k][m]=9;
}
}
void display(int a[100][100],int n)
{
int i,k,j,m;
printf("*********************Project created in 4/2/2017**************");
printf("\n------------------------------------------------------------\n");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i][j]!=0)
printf("%d\t",a[i][j]);
else
printf("\t");
}
printf("\n\n");
}
}
void refresh(int a[100][100],int n)
{
int i,j;
for(i=0;i<n;i++)
for(j=0;j<n;j++)
a[i][j]=0;
}
void disp1(l)
{
int i;
printf("\n-------------------------------------------------------------\n");
if(c==l)
{
for(i=0;i<l;i++)
printf("%c",st[i]);
}
else
{
while(c<l)
{

for(i=0;i<=c;i++)
printf("%c",st[i]);
/*sound(20);
delay(10);
nosound(); */
c++;
break;
}
}
}
