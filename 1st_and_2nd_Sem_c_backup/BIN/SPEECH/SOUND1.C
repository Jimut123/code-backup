#include<stdio.h>

void rec();
void rec1();
void rec2();
void rec3();
void rec4();
void main()
{
int k=1;
rec(k);
getch();
}
void rec(int k)
{
if(k>5)
{
nosound();
return;
}
else
{
sound(100);
delay(500);
rec1();
rec(k+1);
}
}
void rec1()
{
sound(1000);
//delay(500);
rec2();
}
void rec2()
{
sound(500);
//delay(500);
rec3();
}
void rec3()
{
sound(900);
//delay(500);
rec4();
}
void rec4()
{
sound(6100);
//delay(500);
return;
}