#include"stdio.h"
#include"math.h"
#include"conio.h"
int main ( )
{
      int a,b,c,x;
printf("\n enter data:");
scanf("%d",& a);
scanf("%d",& b);
scanf("%d",& c);
x=pow((a+b),2)/pow(b,2)+pow((a+c),2)/pow(a,2);
printf("\n%d",x);
getch();
return 0;
}
