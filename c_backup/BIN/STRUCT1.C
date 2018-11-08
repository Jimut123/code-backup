#include<stdio.h>
struct student* input(struct student*,int);
void show(struct student*,int);
struct student* sort(struct student*,int);
struct student
{
char ch[100];
int a[20];
int n;
};
void main()
{
int i;
struct student a1;
clrscr();
printf("Enter name ::");
gets(a1.ch);
printf("Enter the no. of subjects ::");
scanf("%d",&a1.n);
for(i=0;i<a1.n;i++)
scanf("%d",&a1.a[i]);
getch();
}
