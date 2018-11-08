#include"stdio.h"
#include"conio.h"
#include"math.h"
void main()
{
     int ci,p,r,t,x;
     printf("\n ENTER DATA");
     scanf("%d", &p);
     scanf("%d", &r);
     scanf("%d", &t);
x=pow((float)(((float)(1+r))/100),t);
ci=p*x;
//sqrt(t);
printf("\n %d", ci);
getch();
}

