#include<stdio.h>
void main()
{
int i,n,v=0;
char *a;
clrscr();
printf("Enter the size of string::");
scanf("%d",&n);
printf("Enter the elements:");
a=(char *)malloc(n*sizeof(char));
fflush(stdin);
gets(a);
for(i=0;i<=n/2;i++)
{
if(*(a+i)!=*(a+(n-i-1)))
{
v=1;
break;
}
//printf("\n%c",*(a+i));
}
if(v==0)
printf("Palindrome.");
else
printf("Not Palindrome.");
getch();
}