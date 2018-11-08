#include<stdio.h>
#include<math.h>
void main()
{
int i,n,l;
clrscr();
printf("Enter the no. of digits :");
scanf("%d",&n);
l=(int)pow(10,n);
printf("CRACK::");
for(i=0;i<l;i++)
printf("%d\n",i);
getch();
}