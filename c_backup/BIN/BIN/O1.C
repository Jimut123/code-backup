#define PRT(x,y,z) printf("x = %d y = %d z = %d\n",x,y,z);
#define PRINT(int) printf("int = %d\n",int);
#include<stdio.h>
void main()
{
int x=1,y=1,z=1;
x+=y+=z;
clrscr();
PRINT(x<y?y:x);
x=y=z=-1;
++x||++y&&++z;
PRT(x,y,z);
x=y=z=1;
++x&&++y||++z;
PRT(x,y,z);
getch();
}