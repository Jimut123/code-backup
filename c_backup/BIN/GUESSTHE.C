#include<stdio.h>
#include<math.h>
#include <stdlib.h>
#include <time.h>
void main()
{
int n=0,c,u,v=1;
clrscr();
c=rand(5);
//c=c+10;
printf("%d",c);
while(n<5&&v!=0)
{
printf("\nEnter the number you think that the computer thinks ::");
printf("\nChance no. = %d\n",(n+1));
scanf("\n%d",&u);
if(u<(c-10))
printf("\nLittle close... think.. a little more");
if(u>=(c-5)&&u<c)
printf("\nVery close.. think a very little more..");
if(u==c)
v=0;
if(u>(c+10))
printf("\nMore... move less");
if(u<=(c+5)&&(u>c))
printf("\nVery close... a little less.");
n++;
}
//clrscr();
if(n<5)
{
printf("\nYou Win!!!");
}
else
printf("\nComputer Wins!!!\nThe value which the computer thought was :: %d",c);
getch();
}