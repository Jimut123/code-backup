#include<stdio.h>
#include<conio.h>

void main()
{
int num1,num2,res;
int op;
printf("***menu driven program***");
printf("press 1 for addition\n");
printf("press 2 for subtraction\n");
printf("press 3 for multiplication\n");
printf("press 4 for division\n");
printf("press 0 for quit\n");
printf("which option you want to choose?\n");
scanf("%d",&op);
fflush(stdin);
switch(op)
{
case 1: res=num1+num2;
printf("the addition=%d",res);
break;

case 1: res=num1-num2;
printf("the subtraction=%d",res);
case 3: res=num1*num2;
printf("the multiplication=%d",res);
break;

case 4: res=num1/num2;
printf("the division=%d",res);
break;


