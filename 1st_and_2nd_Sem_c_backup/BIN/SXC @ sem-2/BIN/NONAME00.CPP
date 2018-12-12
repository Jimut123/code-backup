#include<stdio.h>

#include<conio.h>
void main()
{
int num1,num2,res;
int op;
do{
clrscr();
printf("enter two numbers\n");
scanf("%d%d",&num1,&num2);
printf("press 1 for addition\n");
printf("press 2 for subtraction\n");
printf("press 3 for multiplication\n");
printf("press 4 for division\n");
printf("print 0 for quit\n");
printf("which operation u want?\n");
scanf("%d",&op);
fflush(stdin);
switch(op)
{
case 1: res=num1+num2;
printf("the addition=%d",res);
break;
case 2: res=num1-num2;
printf("the subtract=%d",res);
break;
case 3: res=num1*num2;
printf("the product is=%d",res);
break;
case 4: res=num1/num2;
printf("the division is=%d",res);
break;
}
}
while()
getch();
}
